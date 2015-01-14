package com.kuaibiandang.action;

import com.kuaibiandang.model.Sender;
import com.kuaibiandang.service.SenderService;
import com.kuaibiandang.service.Impl.SenderServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class SenderDetailAction extends ActionSupport {

	/**
	 * 送餐员详情
	 */
	private static final long serialVersionUID = 1L;
	private String sender_id = null;
	private Sender sender = null;
	private SenderService ss = new SenderServiceImpl();

	public Sender getSender() {
		return sender;
	}

	public void setSender(Sender sender) {
		this.sender = sender;
	}

	public String getSender_id() {
		return sender_id;
	}

	public void setSender_id(String sender_id) {
		this.sender_id = sender_id;
	}

	public String execute() {
		if (sender_id == null) {
			return ERROR;
		} else {
			sender = ss.findByID(sender_id);
			return SUCCESS;
		}

	}
}
