package com.kuaibiandang.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.kuaibiandang.DAO.Impl.ConsumerDao;
import com.kuaibiandang.duanxin.Duanxin;

public class GetYanzhengmaAction implements ServletRequestAware,
		ServletResponseAware {
	private HttpServletRequest request;
	private HttpServletResponse response;
	private String message = null;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setServletResponse(HttpServletResponse response) {
		// TODO Auto-generated method stub
		this.response = response;

	}

	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.request = request;

	}

	// 重新获取验证码
	public String againgetyanzhangme() throws Exception {
		this.response.setContentType("text/html;charset=utf-8");
		this.response.setCharacterEncoding("UTF-8");
		String phonenumber = this.request.getParameter("phonenumber");
		Duanxin duanxin = new Duanxin(phonenumber);
		this.message = duanxin.Send();
		return "success";
	}

	// 获取验证码
	public String getyanzhengma() throws Exception {
		this.response.setContentType("text/html;charset=utf-8");
		this.response.setCharacterEncoding("UTF-8");
		String phonenumber = this.request.getParameter("phonenumber");
		Duanxin duanxin = new Duanxin(phonenumber);
		ConsumerDao condao = new ConsumerDao();
		if (condao.findByPhonenumber(phonenumber) == null) {
			 this.message=duanxin.Send();
			//this.message = "1231";
		} else {
			this.message = "hasregist";
		}
		return "success";
	}
}
