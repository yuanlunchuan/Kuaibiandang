package com.kuaibiandang.DAO.Impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.kuaibiandang.DAO.AdminDAO;
import com.kuaibiandang.model.Admin;
import com.kuaibiandang.tools.DBUtils;

public class AdminDAOImpl implements AdminDAO {
	private QueryRunner runner = null;
	public AdminDAOImpl() {
		runner = new QueryRunner(DBUtils.getDataSource());
	}
	@Override
	public Admin check(String admin_phone, String admin_password) {
		String SQL = "SELECT * FROM admin WHERE admin_phone = ? and admin_password = ?";
		try {
			return runner.query(SQL, new BeanHandler<Admin>(Admin.class),admin_phone,admin_password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean updatePhone(String admin_phone, String admin_password) {
		String SQL = "UPDATE admin SET admin_password = ? and admin_phone = ?";
		int rowEffect = 0;
		try {
			rowEffect = runner.update(SQL,admin_password,admin_phone);
			if (rowEffect >0) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
