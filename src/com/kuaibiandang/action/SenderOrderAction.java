package com.kuaibiandang.action;

import java.util.List;

import com.kuaibiandang.DAO.Impl.OrderServiceImpl;
import com.kuaibiandang.model.Order;
import com.kuaibiandang.service.OrderService;
import com.kuaibiandang.tools.Pager;
import com.opensymphony.xwork2.ActionSupport;

public class SenderOrderAction extends ActionSupport {

	/**
	 * 送餐员订单Action
	 */
	private static final long serialVersionUID = 1L;

	private String sender_id = null;
	OrderService os = new OrderServiceImpl();
	private List<Order> orders = null;

	private int pageNow = 1;
	private int pageSize = 10;
	private int totalSize = sender_id == null ? null : (int) os
			.getCountBySender(sender_id);
	private int totalPage = (totalSize % pageSize == 0) ? (totalSize / pageSize)
			: (totalSize / pageSize + 1); // 全部页数

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getPageNow() {
		return pageNow;
	}

	public void setPageNow(int pageNow) {
		this.pageNow = pageNow;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public String execute() {
		if (sender_id == null) {
			return ERROR;
		} else {
			Pager page = new Pager(pageNow, pageSize, totalSize);
			orders = os.getAllBySender(sender_id, page.getStart(),
					page.getPageSize());
			return SUCCESS;
		}
	}
}
