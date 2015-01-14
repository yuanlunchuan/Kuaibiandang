package com.kuaibiandang.service.Impl;

import com.kuaibiandang.DAO.AdminDAO;
import com.kuaibiandang.DAO.Impl.AdminDAOImpl;
import com.kuaibiandang.model.Admin;
import com.kuaibiandang.service.AdminService;

public class AdminServiceImpl implements AdminService {
	private AdminDAO admindao = null;
	public AdminServiceImpl(){
		admindao = new AdminDAOImpl();
	}
	@Override
	public boolean  check(String admin_phone, String admin_password) {
		Admin admin = admindao.check(admin_phone, admin_password);
		if(admin == null){
			return false;
		} else {
			return true;
		}
	}

	@Override
	public boolean updatePhone(String admin_phone, String admin_password) {
		return admindao.updatePhone(admin_phone, admin_password);
	}

}
