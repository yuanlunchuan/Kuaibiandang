package com.kuaibiandang.action;

import java.util.List;

import com.kuaibiandang.model.Business;
import com.kuaibiandang.service.BusinessService;
import com.kuaibiandang.service.Impl.BusinessServiceImpl;
import com.kuaibiandang.tools.Pager;
import com.opensymphony.xwork2.ActionSupport;

public class ListBusinessAction extends ActionSupport {

	/**
	 * 显示全部的商家
	 */
	private static final long serialVersionUID = 1L;

	private List<Business> businesses;
	BusinessService bs = new BusinessServiceImpl();
	private int pageNow = 1;
	private int pageSize = 5;
	private int totalSize = (int) bs.getCount(1);
	private int totalPage = (totalSize % pageSize  == 0) ? (totalSize / pageSize)
			: (totalSize / pageSize + 1);

	public int getTotalSize() {
		return totalSize;
	}

	public void setTotalSize(int totalSize) {
		this.totalSize = totalSize;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	private int[] pageCount = new int[totalPage];

	public int[] getPageCount() {
		for (int i = 0; i < totalPage; i++) {
			pageCount[i] = i + 1;
		}
		return pageCount;
	}

	public void setPageCount(int[] pageCount) {
		this.pageCount = pageCount;
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

	public List<Business> getBusinesses() {
		return businesses;
	}

	public void setBusinesses(List<Business> businesses) {
		this.businesses = businesses;
	}

	public String execute() {
		Pager page = new Pager(pageNow, pageSize, totalSize);
		businesses = bs.getAll(1,page.getStart(), page.getPageSize());
		return SUCCESS;
	}
}
