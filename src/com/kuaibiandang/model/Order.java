package com.kuaibiandang.model;

import java.sql.Timestamp;

public class Order {
	private String order_id;
	private String order_user_id;
	private String order_sender_id;
	private String order_business_id;
	private String order_dish_id;
	private String order_address;
	private String order_price;
	private String order_get;
	private String order_status;
	private Timestamp order_user_post_time; // 用户提交订单时间
	private Timestamp order_business_get_time; // 商家确认时间
	private Timestamp order_sender_qiang_time; // 送餐员抢单时间
	private Timestamp order_sender_get_time; // 送餐员拿到菜的时间
	private Timestamp order_user_finish_time; // 用户确认时间

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public String getOrder_user_id() {
		return order_user_id;
	}

	public void setOrder_user_id(String order_user_id) {
		this.order_user_id = order_user_id;
	}

	public String getOrder_sender_id() {
		return order_sender_id;
	}

	public void setOrder_sender_id(String order_sender_id) {
		this.order_sender_id = order_sender_id;
	}

	public String getOrder_business_id() {
		return order_business_id;
	}

	public void setOrder_business_id(String order_business_id) {
		this.order_business_id = order_business_id;
	}

	public String getOrder_dish_id() {
		return order_dish_id;
	}

	public void setOrder_dish_id(String order_dish_id) {
		this.order_dish_id = order_dish_id;
	}

	public String getOrder_address() {
		return order_address;
	}

	public void setOrder_address(String order_address) {
		this.order_address = order_address;
	}

	public String getOrder_price() {
		return order_price;
	}

	public void setOrder_price(String order_price) {
		this.order_price = order_price;
	}

	public String getOrder_get() {
		return order_get;
	}

	public void setOrder_get(String order_get) {
		this.order_get = order_get;
	}

	public String getOrder_status() {
		return order_status;
	}

	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}

	public Timestamp getOrder_user_post_time() {
		return order_user_post_time;
	}

	public void setOrder_user_post_time(Timestamp order_user_post_time) {
		this.order_user_post_time = order_user_post_time;
	}

	public Timestamp getOrder_business_get_time() {
		return order_business_get_time;
	}

	public void setOrder_business_get_time(Timestamp order_business_get_time) {
		this.order_business_get_time = order_business_get_time;
	}

	public Timestamp getOrder_sender_qiang_time() {
		return order_sender_qiang_time;
	}

	public void setOrder_sender_qiang_time(Timestamp order_sender_qiang_time) {
		this.order_sender_qiang_time = order_sender_qiang_time;
	}

	public Timestamp getOrder_sender_get_time() {
		return order_sender_get_time;
	}

	public void setOrder_sender_get_time(Timestamp order_sender_get_time) {
		this.order_sender_get_time = order_sender_get_time;
	}

	public Timestamp getOrder_user_finish_time() {
		return order_user_finish_time;
	}

	public void setOrder_user_finish_time(Timestamp order_user_finish_time) {
		this.order_user_finish_time = order_user_finish_time;
	}
}
