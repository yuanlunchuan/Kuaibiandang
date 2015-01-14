package com.kuaibiandang.action;

import java.util.List;

import com.kuaibiandang.model.Business;
import com.kuaibiandang.service.BusinessService;
import com.kuaibiandang.service.Impl.BusinessServiceImpl;
import com.kuaibiandang.tools.Pager;
import com.opensymphony.xwork2.ActionSupport;

public class BusinessAction extends ActionSupport {
	/**
	 * 查看商家的action
	 */
	private static final long serialVersionUID = 1L;
	private BusinessService bs = new BusinessServiceImpl();
	private String business_id = null;
	private List<Business> businesses = null;
	private int pageNow = 1; // 当前页数，默认为1
	private int status = 1;

	private int pageSize = 20; // 一页显示多少条，默认为10

	private int totalSize = (int) bs.getCount(status); // 全部记录数

	private int totalPage = (totalSize % pageSize == 0) ? (totalSize / pageSize)
			: (totalSize / pageSize + 1); // 全部页数
	private int[] pageCount = new int[totalPage];

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	private String phonenumber = null;

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public int[] getPageCount() {
		for (int i = 0; i < totalPage; i++) {
			pageCount[i] = i + 1;
		}
		return pageCount;
	}

	public void setPageCount(int[] pageCount) {
		this.pageCount = pageCount;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public int getTotalSize() {
		return totalSize;
	}

	public void setTotalSize(int totalSize) {
		this.totalSize = totalSize;
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

	public List<Business> getBusinesses() {
		return businesses;
	}

	public void setBusinesses(List<Business> businesses) {
		this.businesses = businesses;
	}

	public String getBusiness_id() {
		return business_id;
	}

	public void setBusiness_id(String business_id) {
		this.business_id = business_id;
	}

	/**
	 * 加入到黑名单
	 * 
	 * @return
	 */
	public String addBlack() {
		if (business_id == null) {
			return ERROR;
		} else {
			bs.addBlack(business_id);
			return SUCCESS;
		}
	}

	public String delete() {
		if (phonenumber == null) {
			return ERROR;
		} else {
			bs.deleteBusiness(phonenumber);
		}
		return SUCCESS;
	}

	/**
	 * 列出审核通过的全部信息
	 * 
	 * @return
	 */
	public String execute() {
		Pager page = new Pager(pageNow, pageSize, totalSize);
		businesses = bs.getAll(status, page.getStart(), page.getPageSize());
		if(status==1){
			return SUCCESS;
		} else {
			return "check"; //审核
		}
		
	}
	
	/**
	 * 审核通过
	 * @return
	 */
	public String check(){
		boolean temp = bs.updateStatus(business_id, status);
		if(temp){
			return SUCCESS;
		} else {
			return ERROR;
		}
	}
	
	/**
	 * 审核失败
	 * @return
	 */
	public String discheck(){
		boolean temp = bs.deleteBusiness(phonenumber);
		if(temp){
			return SUCCESS;
		} else {
			return ERROR;
		}
	}
}
