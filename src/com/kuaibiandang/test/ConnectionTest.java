package com.kuaibiandang.test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.kuaibiandang.model.User;
import com.kuaibiandang.tools.DBUtils;

public class ConnectionTest {
	public static void main(String[] args) {
			QueryRunner runner = new QueryRunner(DBUtils.getDataSource());
			String SQL ="SELECT * FROM users";
			try {
				List<User> users = runner.query(SQL, new BeanListHandler<User>(User.class));
				String t = users.get(1).getUser_id();
				System.out.println(t);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
	}
}
