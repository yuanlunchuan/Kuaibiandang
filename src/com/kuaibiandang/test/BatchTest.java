package com.kuaibiandang.test;

import java.sql.SQLException;
import java.sql.Timestamp;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.kuaibiandang.tools.DBUtils;
import com.kuaibiandang.tools.RandomID;

public class BatchTest {
	/**
	 * 批量添加商家
	 * @return
	 */
	public static Object[][] batch() {
		Object[][] buses = new Object[100][];
		for (int i = 0; i < 100; i++) {
			buses[i] = new Object[] { "B" + RandomID.getRandomID(), "测试数据" + i,
					"123456", RandomID.getRandomID(), "测试" + i, null,
					"测试地址" + i, null,
					new Timestamp(System.currentTimeMillis()), null,null,0,1,1,null,0,null,0,1};
		}
		return buses;
	}

	public static void main(String[] args) {
		QueryRunner runner = new QueryRunner(DBUtils.getDataSource());
		String SQL = "INSERT INTO businesses values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			runner.insertBatch(SQL, new ScalarHandler<>(), BatchTest.batch());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
