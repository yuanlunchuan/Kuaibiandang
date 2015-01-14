package com.kuaibiandang.DAO;

import java.util.List;

import com.kuaibiandang.model.Dish;

public interface DishDAO {
	
	/**
	 * 判断同一个商家是否有这道菜
	 * @param dish_business_id
	 * @param dish_name
	 * @return
	 */
	public boolean BusinesshasIt(String dish_business_id,String dish_name);
	
	/**
	 * 增加一道菜，未审核
	 * @param dish
	 * @return
	 */
	public boolean addDish(Dish dish);
	
	/**
	 * 删除一道菜
	 * @param dish_id
	 * @return
	 */
	public boolean deleteDish(String dish_id);
	
	/**
	 * 更改菜的状态
	 * @param status
	 * @param dish_id
	 * @return
	 */
	public boolean updateDishStatus(int status,String dish_id);
	
	/**
	 * 更新菜的信息
	 */
	public boolean updateDish(Dish dish);
	
	/**
	 * 查询全部菜品
	 * @return
	 */
	public List<Dish> getAll(int start,int num);
	
	/**
	 * 查询某商家的某状态的全部菜品
	 * @param dish_business_id
	 * @return
	 */
	public List<Dish> getDishByBusiness(String dish_business_id,int status,int start,int num);
	
	/**
	 * 根据名字精确查询菜品
	 * @param dish_name
	 * @return
	 */
	public List<Dish> getByName(String dish_name,int start,int num);
	
	/**
	 * 根据名字模糊查询菜品
	 * @param dish_name
	 * @return
	 */
	public List<Dish> getByNameMohu(String dish_name,int start,int num);
	
	/**
	 * 查询菜品状态，返回负数表示查询失败
	 * @param dish_id
	 * @return 返回如果是负数的表示获取失败
	 */
	public int getStatus(String dish_id);
	
	public List<Dish> getDishBystatus(int status);
	
}
