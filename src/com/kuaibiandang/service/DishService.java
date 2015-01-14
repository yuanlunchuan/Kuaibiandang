package com.kuaibiandang.service;

import java.util.List;

import com.kuaibiandang.model.Dish;

public interface DishService {
	
	/**
	 * 修改菜品状态
	 * @param dish_id
	 * @return
	 */
	public boolean updateStatus(int status,String dish_id);
	
	/**
	 * 查找商家的全部菜品
	 */
	public List<Dish> getAllByBusiness(String business_id,int status,int start,int num);
	
	/**
	 * 显示未审核通过的菜品
	 * @return
	 */
	public List<Dish> getAllWei();
}
