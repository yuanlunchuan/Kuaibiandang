package com.kuaibiandang.tools;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * 当涉及到事务时，得到连接应该使用DBUtils.getContainer().get();
 */
public class DBUtils {
	private static ComboPooledDataSource ds = new ComboPooledDataSource();
	public static ThreadLocal<Connection> container = new ThreadLocal<Connection>();

	public static ThreadLocal<Connection> getContainer() {
		return container;
	}

	// 开启事务
	public static void startTransaction() {
		Connection conn = container.get();
		if (conn == null) {
			try {
				conn = ds.getConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			container.set(conn);
		}
		try {
			conn.setAutoCommit(false);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	// 提交事务
	public static void commit() {
		Connection conn = container.get(); // 从线程上获取连接
		if (conn != null) {
			try {
				conn.commit(); // 提交事务
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
	}

	// 事务回滚
	public static void rollback() {
		Connection conn = container.get();// 检查当前线程是否存在连接
		if (conn != null) {
			try {
				conn.rollback();
				container.remove(); // 如果回滚了，则移除该连接
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
	}

	public static Connection getConn() {
		try {
			return ds.getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	/*
	 * public static Connection getConn() { Connection conn = container.get();
	 * if (conn == null) { try { conn = ds.getConnection(); } catch
	 * (SQLException e) { e.printStackTrace(); } finally { container.set(conn);
	 * } } return conn; }
	 */

	// 得到连接池
	public static DataSource getDataSource() {
		return ds;
	}

	// 关闭连接
	public static void close() {
		Connection conn = container.get();
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				container.remove();
			}
		}
	}
}
