package com.kuaibiandang.action;

import java.util.List;

import com.kuaibiandang.model.Blacklist;
import com.kuaibiandang.service.BlacklistService;
import com.kuaibiandang.service.SenderService;
import com.kuaibiandang.service.UserService;
import com.kuaibiandang.service.Impl.BlacklistServiceImpl;
import com.kuaibiandang.service.Impl.SenderServiceImpl;
import com.kuaibiandang.service.Impl.UserServiceImpl;
import com.kuaibiandang.tools.IDJudge;
import com.kuaibiandang.tools.Pager;
import com.opensymphony.xwork2.ActionSupport;

public class BlacklistAction extends ActionSupport {

	/**
	 * 黑名单Action
	 */
	private static final long serialVersionUID = 1L;
	BlacklistService bs = new BlacklistServiceImpl();
	SenderService ss = new SenderServiceImpl();
	UserService us = new UserServiceImpl();
	private List<Blacklist> blacks = null;
	private String blacklist_id;

	public String getBlacklist_id() {
		return blacklist_id;
	}

	public void setBlacklist_id(String blacklist_id) {
		this.blacklist_id = blacklist_id;
	}

	private int pageNow = 1;
	private int pageSize = 10;
	private int roleid = 1; // 角色ID 1 查询商家，2查询送餐员，3查询消费者

	public int getRoleid() {
		return roleid;
	}

	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}
	
	private int totalSize;
	private int totalPage;
	private int[] pageCount;
//	private int totalSize = (int) bs.getCount(roleid);
//	private int totalPage = (totalSize % pageSize == 0) ? (totalSize / pageSize)
//			: (totalSize / pageSize + 1); // 全部页数
//	private int[] pageCount = new int[totalPage];

	public int[] getPageCount() {
		
		return pageCount;
	}

	public void setPageCount(int[] pageCount) {
		this.pageCount = pageCount;
	}

	public int getPageNow() {
		return pageNow;
	}

	public void setPageNow(int pageNow) {
		this.pageNow = pageNow;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalSize() {
		return totalSize;
	}

	public void setTotalSize(int totalSize) {
		this.totalSize = totalSize;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public List<Blacklist> getBlacks() {
		return blacks;
	}

	public void setBlacks(List<Blacklist> blacks) {
		this.blacks = blacks;
	}

	public String execute() {
		totalSize = (int) bs.getCount(roleid);
		totalPage = (totalSize % pageSize == 0) ? (totalSize / pageSize)
				: (totalSize / pageSize + 1);
		pageCount = new int[totalPage];
		for (int i = 0; i < totalPage; i++) {
			pageCount[i] = i + 1;
		}
		for (int i = 0; i < totalPage; i++) {
			pageCount[i] = i + 1;
		}
		if (roleid > 3 || roleid < 1) {
			return ERROR;
		} else {
			Pager page = new Pager(pageNow, pageSize, totalSize);
			blacks = bs.getAll(roleid, page.getStart(), page.getPageSize());
			return SUCCESS;
		}
	}

	/**
	 * 移除黑名单
	 * @return
	 */
	public String delete() {
		int judge = IDJudge.judge(blacklist_id);
		switch (judge) {
		case 2:
			if (bs.deleteBlack(blacklist_id)) {
				return "success_business";
			} else {
				return ERROR;
			}
		case 7:
			if (ss.deleteBlack(blacklist_id)) {
				return "success_sender";
			} else {
				return ERROR;
			}
		case 8:
			if (us.deleteBlack(blacklist_id)) {
				return "success_user";
			} else {
				return ERROR;
			}
		default:
			return ERROR;
		}

	}
}
