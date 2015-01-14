package com.kuaibiandang.action;

import com.kuaibiandang.model.User;
import com.kuaibiandang.service.UserService;
import com.kuaibiandang.service.Impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class UserDetailAction extends ActionSupport {
	/**
	 * 详情action
	 */
	private static final long serialVersionUID = 1L;
	private String user_id = null;

	private UserService us = new UserServiceImpl();
	private User user = null;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String execute() {
		if (user_id == null) {
			return ERROR;
		} else {
			
			user = us.findById(user_id);
			System.out.println(user.getUser_phonenumber());
			return SUCCESS;
		}

	}
}
