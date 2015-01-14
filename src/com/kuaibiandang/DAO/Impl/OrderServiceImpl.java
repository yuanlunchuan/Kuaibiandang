package com.kuaibiandang.DAO.Impl;

import java.util.List;

import com.kuaibiandang.DAO.OrderDAO;
import com.kuaibiandang.model.Order;
import com.kuaibiandang.service.OrderService;

public class OrderServiceImpl implements OrderService {
	private OrderDAO orderDao = new OrderDAOImpl();

	@Override
	public List<Order> getAllByUser(String user_id, int start, int num) {
		return orderDao.getAllByUser(user_id, start, num);
	}

	@Override
	public List<Order> getAllBySender(String sender_id, int start, int num) {
		return orderDao.getAllBySender(sender_id, start, num);
	}

	@Override
	public List<Order> getAllByBusiness(String business_id, int start, int num) {
		return orderDao.getAllByBusiness(business_id, start, num);
	}

	@Override
	public long getCountByUser(String user_id) {
		return orderDao.getCountByUser(user_id);
	}

	@Override
	public long getCountBySender(String sender_id) {
		return orderDao.getCountBySender(sender_id);
	}

	@Override
	public long getCountByBusiness(String business_id) {
		return orderDao.getCountByBusiness(business_id);
	}

}
