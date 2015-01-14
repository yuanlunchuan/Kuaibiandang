package com.kuaibiandang.DAO.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.kuaibiandang.model.Consumer;
import com.kuaibiandang.tools.DBUtils;

public class ConsumerDao {
	Connection db;
	private QueryRunner runner = null;

	public ConsumerDao() {
		runner = new QueryRunner(DBUtils.getDataSource());
	}

	// 通过号码查询用户
	public Consumer findByPhonenumber(String phonenumber) {
		String SQL = "SELECT * FROM users WHERE user_phonenumber =?";
		try {
			return runner.query(SQL, new BeanHandler<Consumer>(Consumer.class),
					phonenumber);
		} catch (SQLException e) {
			e.printStackTrace();

		}
		return null;
	}

	// 通过电话查询用户是否在黑名单中
	public boolean isblack(String phonenumber) {
		boolean result = false;
		String SQL = "SELECT * FROM blacklist WHERE blacklist_phonenumber =?";
		try {
			if (runner.query(SQL, new BeanHandler<Consumer>(Consumer.class),
					phonenumber) != null)
				result = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public String check(String phonenumber, String password) {
		String result = null;
		if (isblack(phonenumber)) {
			result = "isblack";
			return result;
		}
		db = DBUtils.getConn();
		PreparedStatement pstmt;
		try {
			pstmt = db
					.prepareStatement("select * from users where user_phonenumber=? and user_password=?");
			pstmt.setString(1, phonenumber);
			pstmt.setString(2, password);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				result = "loginok";
			} else {
				result = "loginwrong";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public List<?> getAll() {
		// TODO Auto-generated method stub
		db = DBUtils.getConn();
		PreparedStatement pstmt;
		try {
			pstmt = db.prepareStatement("select * from users");
			ResultSet rs = pstmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	// 添加用户前先查看有没有出现重复
	public boolean addConsumer(Consumer con) {
		if (findByPhonenumber(con.getUser_phonenumber()) != null)
			return false;
		try {
			db = DBUtils.getConn();
			PreparedStatement pstmt = db
					.prepareStatement("insert into users values(?,?,?,?,?,?,?,?)");
			pstmt.setString(1, con.getUser_id());
			pstmt.setString(2, con.getUser_name());
			pstmt.setString(3, con.getUser_password());
			pstmt.setTimestamp(4, con.getUser_registertime());
			pstmt.setString(5, con.getUser_phonenumber());
			pstmt.setString(6, con.getUser_image_url());
			pstmt.setString(7, con.getUser_address());
			pstmt.setInt(8, con.getUser_score());
			pstmt.execute();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
