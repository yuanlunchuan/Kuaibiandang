package com.kuaibiandang.action;

import java.util.List;

import com.kuaibiandang.DAO.Impl.OrderServiceImpl;
import com.kuaibiandang.model.Order;
import com.kuaibiandang.service.OrderService;
import com.kuaibiandang.tools.Pager;
import com.opensymphony.xwork2.ActionSupport;

public class BusinessOrderAction extends ActionSupport {

	/**
	 * 商家订单Action
	 */
	private static final long serialVersionUID = 1L;

	OrderService os = new OrderServiceImpl();
	private String business_id = null;
	private List<Order> orders = null;

	private int pageNow = 1;// 当前页数
	private int pageSize = 10; // 默认每页显示10页
	private int totalSize = (business_id == null) ? null : (int) os
			.getCountByBusiness(business_id);
	private int totalPage = (totalSize % pageSize == 0) ? (totalSize / pageSize)
			: (totalSize / pageSize + 1);

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public String getBusiness_id() {
		return business_id;
	}

	public void setBusiness_id(String business_id) {
		this.business_id = business_id;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageNow() {
		return pageNow;
	}

	public void setPageNow(int pageNow) {
		this.pageNow = pageNow;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public String execute() {
		if (business_id == null) {
			return ERROR;
		} else {
			Pager page = new Pager(pageNow, pageSize, totalSize);
			orders = os.getAllByBusiness(business_id, page.getStart(),
					page.getPageSize());
			return SUCCESS;
		}

	}
}
