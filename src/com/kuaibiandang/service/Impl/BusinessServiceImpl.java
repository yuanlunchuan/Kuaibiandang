package com.kuaibiandang.service.Impl;

import java.sql.Timestamp;
import java.util.List;

import com.kuaibiandang.DAO.BlacklistDAO;
import com.kuaibiandang.DAO.BusinessDAO;
import com.kuaibiandang.DAO.Impl.BlacklistDAOImpl;
import com.kuaibiandang.DAO.Impl.BusinessDAOImpl;
import com.kuaibiandang.model.Blacklist;
import com.kuaibiandang.model.Business;
import com.kuaibiandang.service.BusinessService;

public class BusinessServiceImpl implements BusinessService {
	private BlacklistDAO black = new BlacklistDAOImpl();
	private BusinessDAO busDao = new BusinessDAOImpl();

	@Override
	public boolean check(String phonenumber, String password) {
		int status = busDao.getStatus(phonenumber);
		switch (status) {
		case -1:
			System.out.println("该电话号码尚未注册");
			return false;
		case 0:
			System.out.println("请稍等，您的信息正在审核中");
			return false;
		case 1:
			Business bus = busDao.check(phonenumber, password);
			if (bus != null) {
				return true;
			} else {
				return false;
			}
		case 2:
			System.out.println("对不起，您的账户已被封禁");
		}
		return false;
	}

	@Override
	public List<Business> getAll(int status,int start, int num) {
		return busDao.getAll(status,start, num);
	}

	@Override
	public long getCount(int status) {
		return busDao.getCount(status);
	}

	@Override
	public boolean deleteBusiness(String phonenumber) {
		return busDao.deleteBusiness(phonenumber);
	}

	@Override
	public boolean addBlack(String business_id) {
		Business bus = busDao.findByID(business_id);
		Blacklist b = new Blacklist(bus.getBusiness_id(),new Timestamp(System.currentTimeMillis()),bus.getBusiness_phonenumber());
		busDao.updateBusinessStatusByID(business_id, 2);
		return black.addBlacklist(b);
	}

	@Override
	public boolean updateStatus(String business_id, int status) {
		return busDao.updateBusinessStatusByID(business_id, status);
	}

}
