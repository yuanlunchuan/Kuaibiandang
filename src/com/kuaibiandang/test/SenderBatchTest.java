package com.kuaibiandang.test;

import java.sql.SQLException;
import java.sql.Timestamp;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.kuaibiandang.tools.DBUtils;
import com.kuaibiandang.tools.RandomID;

public class SenderBatchTest {
	/**
	 * 批量添加送餐员
	 * 
	 * @return
	 */
	public static Object[][] batch() {
		Object[][] buses = new Object[100][];
		for (int i = 0; i < 100; i++) {
			buses[i] = new Object[] { "S" + RandomID.getRandomID(), "测试数据" + i,
					"123456", RandomID.getRandomID(), RandomID.getRandomID(),
					new Timestamp(System.currentTimeMillis()), null, 12, 1,
					200, 0, 0, 1, null };
		}
		return buses;
	}

	public static void main(String[] args) {
		QueryRunner runner = new QueryRunner(DBUtils.getDataSource());
		String SQL = "INSERT INTO senders values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			runner.insertBatch(SQL, new ScalarHandler<>(),
					SenderBatchTest.batch());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
