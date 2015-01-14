package com.kuaibiandang.test;

import com.kuaibiandang.DAO.AddressDAO;
import com.kuaibiandang.DAO.BusinessDAO;
import com.kuaibiandang.DAO.DishDAO;
import com.kuaibiandang.DAO.OrderDAO;
import com.kuaibiandang.DAO.Impl.AddressDAOImpl;
import com.kuaibiandang.DAO.Impl.BusinessDAOImpl;
import com.kuaibiandang.DAO.Impl.DishDAOImpl;
import com.kuaibiandang.DAO.Impl.OrderDAOImpl;
import com.kuaibiandang.service.BusinessService;
import com.kuaibiandang.service.Impl.BusinessServiceImpl;

public class Tset {
	
	public static void main(String[] args) {
		BusinessDAO bus = new BusinessDAOImpl();
		int t =bus.getStatus("1223324");
		System.out.println(t);
	}
}
