package com.kuaibiandang.action;

import java.util.List;

import com.kuaibiandang.model.Sender;
import com.kuaibiandang.service.SenderService;
import com.kuaibiandang.service.Impl.SenderServiceImpl;
import com.kuaibiandang.tools.Pager;
import com.opensymphony.xwork2.ActionSupport;

public class SenderAction extends ActionSupport {

	/**
	 * 送餐员Action
	 */
	private static final long serialVersionUID = 1L;
	SenderService ss = new SenderServiceImpl();
	private int sender_status = 1; // 送餐员状态默认为1

	private int pageNow = 1; // 默认页数
	private List<Sender> senders = null;
	private String sender_id = null;
	private int pageSize = 20;
	private int totalSize = (int) ss.getCount(sender_status);
	private int totalPage = (totalSize % pageSize == 0) ? (totalSize / pageSize)
			: (totalSize / pageSize + 1);

	private int[] pageCount = new int[totalPage];

	public int[] getPageCount() {
		for (int i = 0; i < totalPage; i++) {
			pageCount[i] = i + 1;
		}
		return pageCount;
	}

	public void setPageCount(int[] pageCount) {
		this.pageCount = pageCount;
	}

	public List<Sender> getSenders() {
		return senders;
	}

	public void setSenders(List<Sender> senders) {
		this.senders = senders;
	}

	public int getSender_status() {
		return sender_status;
	}

	public void setSender_status(int sender_status) {
		this.sender_status = sender_status;
	}

	public int getPageNow() {
		return pageNow;
	}

	public void setPageNow(int pageNow) {
		this.pageNow = pageNow;
	}

	public String getSender_id() {
		return sender_id;
	}

	public void setSender_id(String sender_id) {
		this.sender_id = sender_id;
	}

	public int getTotalSize() {
		return totalSize;
	}

	public void setTotalSize(int totalSize) {
		this.totalSize = totalSize;
	}

	/**
	 * 列出送餐员,status为页面传入数据
	 * 
	 * @return
	 */
	public String ListSender() {
		if(sender_status==1){
			Pager page = new Pager(pageNow, pageSize, totalSize);
			senders = ss.getAllByStatus(sender_status, page.getStart(),
					page.getPageSize());
			return SUCCESS;
		} else {
			return "check";
		}
		
	}

	public String addBlackSender() {
		if (sender_id == null) {
			return ERROR;
		} else {
			ss.addBlack(sender_id);
			return SUCCESS;
		}
	}

	public String deleteSender() {
		if (sender_id == null) {
			return ERROR;
		} else {
			ss.deleteSender(sender_id);
			return SUCCESS;
		}
	}
	
	/**
	 * 通过审核
	 * @return
	 */
	public String check(){
		boolean temp = ss.updateStatus(sender_id, 1);
		if(temp){
			return SUCCESS;
		} else {
			return 	ERROR;
		}
		
	}
	
	/**
	 * 审核失败，删除
	 */
	public String discheck(){
		boolean temp = ss.deleteSender(sender_id);
		if(temp){
			return SUCCESS;
		} else {
			return ERROR;
		}
	}
}
