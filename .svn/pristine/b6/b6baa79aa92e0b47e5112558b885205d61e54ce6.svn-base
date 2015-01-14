package com.kuaibiandang.service.Impl;

import com.kuaibiandang.DAO.BusinessDAO;
import com.kuaibiandang.DAO.Impl.BusinessDAOImpl;
import com.kuaibiandang.service.BusinessMobileService;

public class BuinsessMobileServiceImpl implements BusinessMobileService {
	
	private BusinessDAO busDAO = new BusinessDAOImpl();
	
	@Override
	public int getStatus(String phonenumber) {
		return busDAO.getStatus(phonenumber);
	}

}
