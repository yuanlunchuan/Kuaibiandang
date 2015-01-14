package com.kuaibiandang.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport implements SessionAware {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected Map<String, Object> dataMap;

	public Map<String, Object> getDataMap() {
		return dataMap;
	}

	public void setDataMap(Map<String, Object> dataMap) {
		this.dataMap = dataMap;
	}

	public BaseAction() {
		dataMap = new HashMap<String, Object>();
	}

	@Override
	public void setSession(Map<String, Object> sessionMap) {

	}

	protected Map<String, Object> getSession() {
		return (Map<String, Object>) ActionContext.getContext().getSession();
	}

	protected HttpServletRequest getRequest() {
		return ServletActionContext.getRequest();
	}

}
