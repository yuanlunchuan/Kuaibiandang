package com.kuaibiandang.service;

import java.util.List;

import com.kuaibiandang.model.Order;

public interface OrderService {

	/**
	 * 查询某用户的全部订单
	 * 
	 * @return
	 */
	public List<Order> getAllByUser(String user_id, int start, int num);

	/**
	 * 查询某送餐员的全部订单
	 * 
	 * @return
	 */
	public List<Order> getAllBySender(String sender_id, int start, int num);

	/**
	 * 查询某商家全部订单
	 */
	public List<Order> getAllByBusiness(String business_id, int start, int num);

	/**
	 * 返回某用户订单总数
	 * 
	 * @param user_id
	 * @return
	 */
	public long getCountByUser(String user_id);

	/**
	 * 返回某送餐员订单总数
	 * 
	 * @param sender_id
	 * @return
	 */
	public long getCountBySender(String sender_id);

	/**
	 * 返回某商家订单总数
	 * 
	 * @param business_id
	 * @return
	 */
	public long getCountByBusiness(String business_id);
}
