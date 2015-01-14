package com.kuaibiandang.action;

import java.util.List;

import com.kuaibiandang.model.User;
import com.kuaibiandang.service.UserService;
import com.kuaibiandang.service.Impl.UserServiceImpl;
import com.kuaibiandang.tools.Pager;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {

	/**
	 * 用户Action
	 */
	private static final long serialVersionUID = 1L;
	UserService us = new UserServiceImpl();
	private String user_id;
	private List<User> users;
	private int pageNow = 1;

	private int pageSize = 20;
	private int totalSize = (int) us.getCount(); // 总记录

	private int totalPage = (totalSize % pageSize == 0) ? (totalSize / pageSize)
			: (totalSize / pageSize + 1); // 总页数
	private int[] pageCount = new int[totalPage];

	public int getPageNow() {
		return pageNow;
	}

	public void setPageNow(int pageNow) {
		this.pageNow = pageNow;
	}

	public int getTotalSize() {
		return totalSize;
	}

	public void setTotalSize(int totalSize) {
		this.totalSize = totalSize;
	}

	public int[] getPageCount() {
		for (int i = 0; i < totalPage; i++) {
			pageCount[i] = i + 1;
		}
		return pageCount;
	}

	public void setPageCount(int[] pageCount) {
		this.pageCount = pageCount;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	/**
	 * 列出用户
	 * 
	 * @return
	 */
	public String ListUser() {
		Pager page = new Pager(pageNow, pageSize, totalSize);
		users = us.getAllNotInBlack(page.getStart(), page.getPageSize());
		return SUCCESS;
	}

	/**
	 * 封禁用户
	 * 
	 * @return
	 */
	public String addBlack() {
		if (user_id == null) {
			return ERROR;
		} else {
			boolean temp = us.addBlack(user_id);
			if (temp) {
				return SUCCESS;
			} else {
				return ERROR;
			}
		}
	}

	/**
	 * 删除用户
	 * 
	 * @return
	 */
	public String deleteUser() {
		if (user_id == null) {
			return ERROR;
		} else {
			boolean temp = us.deleteUser(user_id);
			if (temp) {
				return SUCCESS;
			} else {
				return ERROR;
			}
		}
	}

}
