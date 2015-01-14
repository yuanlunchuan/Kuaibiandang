package com.kuaibiandang.DAO.Impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.kuaibiandang.DAO.ConsumerDAO;
import com.kuaibiandang.model.Consumer;
import com.kuaibiandang.tools.DBUtils;

public class ConsumerDAOImpl implements ConsumerDAO {

	private QueryRunner runner = null;

	public ConsumerDAOImpl() {
		runner = new QueryRunner(DBUtils.getDataSource());
	}

	@Override
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

	@Override
	public boolean check(String phonenumber, String password) {
		Consumer c = null;
		String SQL = "SELECT * FROM users WHERE user_phonenumber=? and user_password=?";
		try {
			c = runner.query(SQL, new BeanHandler<Consumer>(Consumer.class),
					phonenumber, password);
			if (c != null) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean addConsumer(Consumer con) {
		// 查询到手机号码已经注册，返回错误
		if (findByPhonenumber(con.getUser_phonenumber()) != null) {
			return false;
		}
		String SQL = "INSERT INTO users values(?,?,?,?,?,?,?,?)";
		int rowEffect = 0;
		try {
			rowEffect = runner.update(SQL, con.getUser_id(),
					con.getUser_name(), con.getUser_password(),
					con.getUser_registertime(), con.getUser_phonenumber(),
					con.getUser_image_url(), con.getUser_address(),
					con.getUser_score());
			if (rowEffect > 0) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Consumer> getAll(int start, int num) {
		String SQL = "SELECT * FROM users LIMIT ?,?";
		try {
			return runner.query(SQL, new BeanListHandler<Consumer>(
					Consumer.class), start, num);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
