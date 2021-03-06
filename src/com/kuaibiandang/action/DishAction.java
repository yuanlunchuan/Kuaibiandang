package com.kuaibiandang.action;

import java.util.List;

import com.kuaibiandang.model.Dish;
import com.kuaibiandang.service.DishService;
import com.kuaibiandang.service.Impl.DishServiceImpl;
import com.kuaibiandang.tools.Pager;
import com.opensymphony.xwork2.ActionSupport;

public class DishAction extends ActionSupport {
	/**
	 * 菜品Action
	 */
	private static final long serialVersionUID = 1L;
	DishService ds = new DishServiceImpl();
	private List<Dish> dishes;
	private int status = 1;

	private String business_id = null; // 商家ID
	private String dish_id = null;
	private int pageNow = 1; // 当前页数，默认为1

	private int pageSize = 10; // 一页显示多少条，默认为10
	private int totalSize =1; //TODO
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
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

	public String getDish_id() {
		return dish_id;
	}

	public void setDish_id(String dish_id) {
		this.dish_id = dish_id;
	}

	public String getBusiness_id() {
		return business_id;
	}

	public void setBusiness_id(String business_id) {
		this.business_id = business_id;
	}

	public List<Dish> getDishes() {
		return dishes;
	}

	public void setDishes(List<Dish> dishes) {
		this.dishes = dishes;
	}

	/**
	 * 显示未审核的菜品
	 * 
	 * @return
	 */
	public String ListDishWei() {
		dishes = ds.getAllWei();
		return SUCCESS;
	}

	/**
	 * 显示已经审核通过的菜品
	 * 
	 * @return
	 */
	public String ListDish() {
		if (business_id == null) {
			return ERROR;
		} else {
			Pager page = new Pager(pageNow,pageSize,totalSize);
			dishes = ds.getAllByBusiness(business_id, status, page.getStart(), page.getPageSize());
			return SUCCESS;
		}

	}

	/**
	 * 审核商品,将状态改为1
	 * 
	 * @return
	 */
	public String updateStatus() {
		boolean temp = ds.updateStatus(1, dish_id);
		if (temp) {
			return SUCCESS;
		} else {
			return ERROR;
		}
	}
}
