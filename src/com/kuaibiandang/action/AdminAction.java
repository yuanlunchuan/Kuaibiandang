package com.kuaibiandang.action;


import com.kuaibiandang.model.Admin;
import com.kuaibiandang.service.AdminService;
import com.kuaibiandang.service.Impl.AdminServiceImpl;

public class AdminAction extends BaseAction {

	/**
	 * 管理员Action
	 */

	private static final long serialVersionUID = 1L;
	private String message; // 保存错误信息
	private Admin admin;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	AdminService as = new AdminServiceImpl();

	public String execute() {
		boolean check = as.check(admin.getAdmin_phone(),
				admin.getAdmin_password());
		if (check) {
			return SUCCESS;
		} else {
			setMessage("用户名或者密码错误");
			return ERROR;
		}
	}
	
	@Override
	public void validate(){
		if(admin.getAdmin_phone().equals("")){
			this.addFieldError("name", "用户名不能为空");
		} 
		if(admin.getAdmin_password().equals("")){
			this.addFieldError("password", "密码不能为空");
		}
	}
}
