package com.kuaibiandang.model;

import java.sql.Timestamp;

public class Consumer {
	private String user_id;
	private String user_name;
	private String user_password;
	private Timestamp user_registertime;

	public Timestamp getUser_registertime() {
		return user_registertime;
	}

	public void setUser_registertime(Timestamp user_registertime) {
		this.user_registertime = user_registertime;
	}

	private String user_phonenumber;
	private String user_image_url;
	private String user_address;
	private int user_score;

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getUser_phonenumber() {
		return user_phonenumber;
	}

	public void setUser_phonenumber(String user_phonenumber) {
		this.user_phonenumber = user_phonenumber;
	}

	public String getUser_image_url() {
		return user_image_url;
	}

	public void setUser_image_url(String user_image_url) {
		this.user_image_url = user_image_url;
	}

	public String getUser_address() {
		return user_address;
	}

	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}

	public int getUser_score() {
		return user_score;
	}

	public void setUser_score(int user_score) {
		this.user_score = user_score;
	}
}
