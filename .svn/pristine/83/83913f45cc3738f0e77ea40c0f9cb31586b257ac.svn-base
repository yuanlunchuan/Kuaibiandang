package com.kuaibiandang.action;

import java.sql.Timestamp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.kuaibiandang.DAO.BlacklistDAO;
import com.kuaibiandang.DAO.ConsumerDAO;
import com.kuaibiandang.DAO.Impl.BlacklistDAOImpl;
import com.kuaibiandang.DAO.Impl.ConsumerDAOImpl;
import com.kuaibiandang.model.Consumer;
import com.kuaibiandang.tools.RandomID;
import com.opensymphony.xwork2.ActionSupport;

public class ConsumerAction extends ActionSupport implements
		ServletRequestAware, ServletResponseAware {
	private static final long serialVersionUID = 1L;
	private ConsumerDAO  condao = new ConsumerDAOImpl();
	private BlacklistDAO black = new BlacklistDAOImpl();
	private String message;// 使用json返回单个值
	private HttpServletRequest request;
	private HttpServletResponse response;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	// 返回单个值
	public String checkLogin() {
		this.message = "成功返回单个值";
		return SUCCESS;
	}

	public void setServletRequest(HttpServletRequest request) {
		this.request = request;

	}

	public void setServletResponse(HttpServletResponse response) {
		this.response = response;

	}

	public String userRegister() {
		// 设置响应字符编码
		this.response.setContentType("text/html;charset=utf-8");
		this.response.setCharacterEncoding("UTF-8");

		// 获取android端提交的电话号码，用户名，密码
		String phonenumber = this.request.getParameter("phonenumber");
		String password = this.request.getParameter("password");
		String username = this.request.getParameter("username");

		// 对数据进行封装
		Consumer con = new Consumer();
		con.setUser_id("U" + RandomID.getRandomID());
		con.setUser_name(username);
		con.setUser_password(password);
		con.setUser_phonenumber(phonenumber);
		con.setUser_registertime(new Timestamp(System.currentTimeMillis()));
		// 用户注册
		//ConsumerDao condao = new ConsumerDao();
		if (condao.addConsumer(con))
			this.message = "true";
		else
			this.message = "false";
		return SUCCESS;
	}

	public String json() {
		this.response.setContentType("text/html;charset=utf-8");
		this.response.setCharacterEncoding("UTF-8");

		//ConsumerDao condao = new ConsumerDao();
		String phonenumber = this.request.getParameter("phonenumber");
		String password = this.request.getParameter("password");

		try {
			//if (condao.check(phonenumber, password).equals("isblack")) {
			if(black.hasBlacklist(phonenumber)){
				this.message = "isblack";
			} else if (condao.check(phonenumber, password)) {
				this.message = "loginok";
			} else
				this.message = "loginwrong";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
}
