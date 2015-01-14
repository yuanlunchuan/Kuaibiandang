package com.kuaibiandang.DAO;

import java.sql.Timestamp;
import java.util.List;

import com.kuaibiandang.model.Order;

public interface OrderDAO {
	
	/**
	 * 增加一张订单
	 */
	public boolean addOrder(Order order);
	
	/**
	 * 更改订单状态
	 */
	public boolean updateOrderStatus(String order_id,int status);
	
	/**
	 * 查询某商家的全部订单
	 */
	public List<Order> getAllByBusiness(String business_id,int start,int num);
	
	/**
	 * 查询某用户的全部订单
	 */
	public List<Order> getAllByUser(String user_id,int start,int num);
	
	/**
	 * 查询某个用户的某个菜品的全部订单,对于普通用户来说，只需要得到份数即可
	 */
	public int getAllByUserDish(String user_id,String dish_id);
	
	/**
	 * 查询某商家的某个菜品的全部订单,比如说要统计哪个菜最受欢迎
	 */
	public List<Order> getAllByBusinessDish(String business_id,String dish_id,int start,int num);
	
	/**
	 * 查询订单的状态
	 * @return 返回int类型,负数表示失败
	 */
	public int getStatus(String order_id);
	
	/**
	 * 根据状态查询订单时间
	 */
	public List<Timestamp> getTime(String order_id);
	
	/**
	 * 查询某送餐员的全部订单
	 * @return
	 */
	public List<Order>  getAllBySender(String sender_id,int start,int num);
	
	//TODO
	
	/**
	 * 根据商家id,送餐员id查询订单
	 * @param sender_id
	 * @param business_id
	 * @return
	 */
	public List<Order>  getAllByBusinessSender(String sender_id,String business_id,int start,int num);
	
	/**
	 * 查询订单的总数
	 * @return
	 */
	public long getCount();
	
	/**
	 * 查询某用户订单的总数，并区分状态
	 */
	public long getCountByUser(String user_id,int status);
	
	/**
	 * 查询某送餐员订单总数，并区分状态
	 */
	public long getCountBySender(String sender_id,int status);
	
	/**
	 * 查询某菜品的总数
	 */
	public long getCountByDish(String dish_id);
	
	/**
	 * 根据状态返回订单
	 */
	public List<Order> getByStatus(int status,int start,int num);
	
	/**
	 * 返回某用户订单总数
	 * @param user_id
	 * @return
	 */
	public long getCountByUser(String user_id);
	
	/**
	 * 返回某送餐员订单总数
	 * @param sender_id
	 * @return
	 */
	public long getCountBySender(String sender_id);
	
	/**
	 * 返回某商家订单总数
	 * @param business_id
	 * @return
	 */
	public long getCountByBusiness(String business_id);
}
