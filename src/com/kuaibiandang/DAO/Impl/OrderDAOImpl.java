package com.kuaibiandang.DAO.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.kuaibiandang.DAO.OrderDAO;
import com.kuaibiandang.model.Order;
import com.kuaibiandang.tools.DBUtils;

public class OrderDAOImpl implements OrderDAO {
	private QueryRunner runner = null;

	public OrderDAOImpl() {
		runner = new QueryRunner(DBUtils.getDataSource());
	}

	@Override
	public boolean addOrder(Order order) {
		String SQL = "INSERT INTO orders values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		int rowEffect = 0;
		try {
			rowEffect = runner.update(SQL, order.getOrder_id(),
					order.getOrder_user_id(), order.getOrder_sender_id(),
					order.getOrder_business_id(), order.getOrder_dish_id(),
					order.getOrder_address(), order.getOrder_price(),
					order.getOrder_get(), order.getOrder_status(),
					order.getOrder_user_post_time(),
					order.getOrder_business_get_time(),
					order.getOrder_sender_qiang_time(),
					order.getOrder_sender_get_time(),
					order.getOrder_user_finish_time());
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
	public boolean updateOrderStatus(String order_id, int status) {
		String SQL = "UPDATE orders SET order_id = ? WHERE order_status = ?";
		int rowEffect = 0;
		try {
			rowEffect = runner.update(SQL, order_id, status);
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
	public List<Order> getAllByBusiness(String business_id, int start, int num) {
		String SQL = "SELECT * FROM orders WHERE order_business_id = ?";
		try {
			return runner.query(SQL, new BeanListHandler<Order>(Order.class),
					business_id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Order> getAllByUser(String user_id, int start, int num) {
		String SQL = "SELECT * FROM orders WHERE order_user_id = ?";
		try {
			return runner.query(SQL, new BeanListHandler<Order>(Order.class),
					user_id, start, num);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int getAllByUserDish(String user_id, String dish_id) {
		String SQL = "SELECT COUNT(order_id) FROM orders WHERE order_user_id = ? and order_dish_id = ?";
		try {
			runner.query(SQL, new BeanHandler<Integer>(Integer.class), user_id,
					dish_id);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public List<Order> getAllByBusinessDish(String business_id, String dish_id,
			int start, int num) {
		String SQL = "SELECT * FROM orders WHERE order_business_id = ? and order_dish_id = ? LIMIT ?,?";
		try {
			return runner.query(SQL, new BeanListHandler<Order>(Order.class),
					business_id, dish_id, start, num);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int getStatus(String order_id) {
		String SQL = "SELECT order_status FROM orders WHERE order_id = ?";
		Connection conn = DBUtils.getConn();
		PreparedStatement pstmt = null;
		ResultSet result = null;
		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, order_id);
			result = pstmt.executeQuery();
			if (result.next()) {
				return result.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (result != null) {
					result.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return -1;
	}

	@Override
	public List<Timestamp> getTime(String order_id) {
		String SQL = "SELECT order_user_post_time,order_business_get_time,order_sender_qiang_time,order_sender_get_time,order_user_finish_time FROM orders WHERE order_id =?";
		Connection conn = DBUtils.getConn();
		PreparedStatement pstmt = null;
		ResultSet result = null;
		List<Timestamp> times = null;
		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, order_id);
			result = pstmt.executeQuery();
			times = new ArrayList<Timestamp>();
			if (result.next()) {
				if (result.getTimestamp(1) != null) {
					times.add(result.getTimestamp(1));
				}
				if (result.getTimestamp(2) != null) {
					times.add(result.getTimestamp(2));
				}
				if (result.getTimestamp(3) != null) {
					times.add(result.getTimestamp(3));
				}
				if (result.getTimestamp(4) != null) {
					times.add(result.getTimestamp(4));
				}
				if (result.getTimestamp(5) != null) {
					times.add(result.getTimestamp(5));
				}
				return times;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (result != null) {
					result.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return times;
	}

	@Override
	public List<Order> getAllBySender(String sender_id, int start, int num) {
		String SQL = "SELECT * FROM orders WHERE order_sender_id = ? LIMIT ?,?";
		try {
			return runner.query(SQL, new BeanListHandler<Order>(Order.class),
					sender_id, start, num);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Order> getAllByBusinessSender(String sender_id,
			String business_id, int start, int num) {
		String SQL = "SELECT * FROM orders WHERE order_sender_id = ? and order_business_id = ? LIMIT ?,?";
		try {
			return runner.query(SQL, new BeanListHandler<Order>(Order.class),
					sender_id, business_id, start, num);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public long getCount() {
		String SQL = "SELECT COUNT('order_id') FROM orders";
		try {
			return runner.query(SQL, new ScalarHandler<Long>());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0L;
	}

	@Override
	public long getCountByUser(String user_id, int status) {
		String SQL = "SELECT COUNT('order_id') FROM orders WHERE order_user_id = ? and order_status = ?";
		try {
			return runner
					.query(SQL, new ScalarHandler<Long>(), user_id, status);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0L;
	}

	@Override
	public long getCountBySender(String sender_id, int status) {
		String SQL = "SELECT COUNT('order_id') FROM orders WHERE order_sender_id = ? and order_status = ?";
		try {
			return runner.query(SQL, new ScalarHandler<Long>(), sender_id,
					status);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0L;
	}

	@Override
	public long getCountByDish(String dish_id) {
		String SQL = "SELECT COUNT('order_id') FROM orders WHERE order_dish_id = ?";
		try {
			return runner.query(SQL, new ScalarHandler<Long>(), dish_id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0L;
	}

	@Override
	public List<Order> getByStatus(int status,int start,int num) {
		String SQL = "SELECT * FROM orders WHERE order_status = ? LIMIT ?,?";
		try {
			return runner.query(SQL, new BeanListHandler<Order>(Order.class),status,start,num);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public long getCountByUser(String user_id) {
		String SQL = "SELECT COUNT('order_id') FROM orders WHERE order_user_id = ?";
		try {
			return runner.query(SQL, new ScalarHandler<Long>(),user_id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public long getCountBySender(String sender_id) {
		String SQL = "SELECT COUNT('order_id') FROM orders WHERE order_sender_id = ?";
		try {
			return runner.query(SQL, new ScalarHandler<Long>(),sender_id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public long getCountByBusiness(String business_id) {
		String SQL = "SELECT COUNT('order_id') FROM orders WHERE order_business_id = ?";
		try {
			return runner.query(SQL, new ScalarHandler<Long>(),business_id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

}
