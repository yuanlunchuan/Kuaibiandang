package com.kuaibiandang.service.Impl;

import java.util.List;

import com.kuaibiandang.DAO.BlacklistDAO;
import com.kuaibiandang.DAO.Impl.BlacklistDAOImpl;
import com.kuaibiandang.model.Blacklist;
import com.kuaibiandang.service.BlacklistService;
import com.kuaibiandang.service.BusinessService;

public class BlacklistServiceImpl implements BlacklistService {
	private BusinessService bs = new BusinessServiceImpl();
	private BlacklistDAO black = new BlacklistDAOImpl();
	@Override
	public List<Blacklist> getAll(int roleid, int start, int num) {
		return black.getAll(roleid, start, num);
	}
	@Override
	public long getCount(int roleid) {
		return black.getCount(roleid);
	}
	@Override
	public boolean deleteBlack(String business_id) {
		boolean updateStatus = bs.updateStatus(business_id, 1);
		boolean del = black.deleteBlacklist(business_id);
		if(updateStatus&&del){
			return true;
		} else {
			return false;
		}
	}

}
