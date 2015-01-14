package com.kuaibiandang.service.Impl;

import java.util.List;

import com.kuaibiandang.DAO.DishDAO;
import com.kuaibiandang.DAO.Impl.DishDAOImpl;
import com.kuaibiandang.model.Dish;
import com.kuaibiandang.service.DishService;

public class DishServiceImpl implements DishService {
	
	private DishDAO dishDao = new DishDAOImpl();
	@Override
	public boolean updateStatus(int status, String dish_id) { 
		return dishDao.updateDishStatus(status, dish_id);
	}

	@Override
	public List<Dish> getAllByBusiness(String business_id,int status,int start,int num) {
		return dishDao.getDishByBusiness(business_id, status,start, num);
	}

	@Override
	public List<Dish> getAllWei() {
		return dishDao.getDishBystatus(0);
	}
	
}
