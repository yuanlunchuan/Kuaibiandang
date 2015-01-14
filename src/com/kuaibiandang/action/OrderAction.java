package com.kuaibiandang.action;

import java.util.List;

import com.kuaibiandang.DAO.Impl.OrderServiceImpl;
import com.kuaibiandang.model.Order;
import com.kuaibiandang.service.OrderService;
import com.opensymphony.xwork2.ActionSupport;

public class OrderAction extends ActionSupport {

	/**
	 * 订单Action
	 */
	private static final long serialVersionUID = 1L;
	private List<Order> orders = null;
	private String sender_id = null;
	private String user_id;
//	private int pageNow = 1; // 当前页数，默认为1

	//private int pageSize = 10; // 一页显示多少条，默认为10

//	private int totalSize = (int) os.getCount(); // 全部记录数
//	private int totalPage = (totalSize % pageSize == 0) ? (totalSize / pageSize)
//			: (totalSize / pageSize + 1); // 全部页数
	public String getSender_id() {
		return sender_id;
	}

	public void setSender_id(String sender_id) {
		this.sender_id = sender_id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getBusiness_id() {
		return business_id;
	}

	public void setBusiness_id(String business_id) {
		this.business_id = business_id;
	}

	private String business_id;

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	OrderService os = new OrderServiceImpl();

	public String listSender() {
		if(os!=null&&sender_id!=null){
			orders = os.getAllBySender(sender_id, 1, 1);
			return SUCCESS;
		}else{
			return ERROR;
		}
	}

}
