package com.kuaibiandang.model;

import java.sql.Timestamp;

public class Sender {
	/*
	 * 送餐员实体类
	 */
	private String sender_id;
	private String sender_name;
	private String sender_password;
	private String sender_identify;
	private String sender_phonenumber;
	private Timestamp sender_registertime;
	private String sender_seller_id;
	private int sender_speed;
	private int sender_level;
	private float sender_guarantee;
	private float sender_get;
	private float sender_sum; // 送餐员已经拿到的全部的钱
	private int sender_status;
	private String sender_image_url;

	public String getSender_id() {
		return sender_id;
	}

	public void setSender_id(String sender_id) {
		this.sender_id = sender_id;
	}

	public String getSender_name() {
		return sender_name;
	}

	public void setSender_name(String sender_name) {
		this.sender_name = sender_name;
	}

	public String getSender_password() {
		return sender_password;
	}

	public void setSender_password(String sender_password) {
		this.sender_password = sender_password;
	}

	public String getSender_identify() {
		return sender_identify;
	}

	public void setSender_identify(String sender_identify) {
		this.sender_identify = sender_identify;
	}

	public String getSender_phonenumber() {
		return sender_phonenumber;
	}

	public void setSender_phonenumber(String sender_phonenumber) {
		this.sender_phonenumber = sender_phonenumber;
	}

	public String getSender_seller_id() {
		return sender_seller_id;
	}

	public void setSender_seller_id(String sender_seller_id) {
		this.sender_seller_id = sender_seller_id;
	}

	public int getSender_speed() {
		return sender_speed;
	}

	public void setSender_speed(int sender_speed) {
		this.sender_speed = sender_speed;
	}

	public int getSender_level() {
		return sender_level;
	}

	public void setSender_level(int sender_level) {
		this.sender_level = sender_level;
	}

	public float getSender_guarantee() {
		return sender_guarantee;
	}

	public void setSender_guarantee(float sender_guarantee) {
		this.sender_guarantee = sender_guarantee;
	}

	public float getSender_get() {
		return sender_get;
	}

	public void setSender_get(float sender_get) {
		this.sender_get = sender_get;
	}

	public float getSender_sum() {
		return sender_sum;
	}

	public void setSender_sum(float sender_sum) {
		this.sender_sum = sender_sum;
	}

	public int getSender_status() {
		return sender_status;
	}

	public void setSender_status(int sender_status) {
		this.sender_status = sender_status;
	}

	public Timestamp getSender_registertime() {
		return sender_registertime;
	}

	public void setSender_registertime(Timestamp sender_registertime) {
		this.sender_registertime = sender_registertime;
	}

	public String getSender_image_url() {
		return sender_image_url;
	}

	public void setSender_image_url(String sender_image_url) {
		this.sender_image_url = sender_image_url;
	}

}
