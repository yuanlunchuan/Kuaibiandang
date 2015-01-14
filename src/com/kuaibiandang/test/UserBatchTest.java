package com.kuaibiandang.test;

import java.sql.SQLException;
import java.sql.Timestamp;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.kuaibiandang.tools.DBUtils;
import com.kuaibiandang.tools.RandomID;

public class UserBatchTest {
	/**
	 * 批量添加用户
	 * @return
	 */
	public static Object[][] batch() {
		Object[][] buses = new Object[100][];
		for (int i = 0; i < 100; i++) {
			buses[i] = new Object[] { "U" + RandomID.getRandomID(), "测试数据" + i,
					"123456", new Timestamp(System.currentTimeMillis()),
					RandomID.getRandomID(), null, null, 0 };
		}
		return buses;
	}

	public static void main(String[] args) {
		QueryRunner runner = new QueryRunner(DBUtils.getDataSource());
		String SQL = "INSERT INTO users values(?,?,?,?,?,?,?,?)";
		try {
			runner.insertBatch(SQL, new ScalarHandler<>(),
					UserBatchTest.batch());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
