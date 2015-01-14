package com.kuaibiandang.DAO.Impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.kuaibiandang.DAO.UserDAO;
import com.kuaibiandang.model.User;
import com.kuaibiandang.tools.DBUtils;

public class UserDAOImpl implements UserDAO {

	private QueryRunner runner = null;

	public UserDAOImpl() {
		runner = new QueryRunner(DBUtils.getDataSource());
	}

	@Override
	public boolean addUser(User user) {
		String SQL = "INSERT INTO users values(?,?,?,?,?,?,?,?)";
		int rowEffect = 0;
		try {
			rowEffect = runner.update(SQL, user.getUser_id(),
					user.getUser_name(), user.getUser_password(),
					user.getUser_registertime(), user.getUser_phonenumber(),
					user.getUser_image_url(), user.getUser_address(),
					user.getUser_score());
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
	public boolean deleteUser(String user_id) {
		String SQL = "DELETE FROM users WHERE user_id = ?";
		int rowEffect = 0;
		try {
			rowEffect = runner.update(SQL, user_id);
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
	public boolean updateUserName(String user_id, String user_name) {
		String SQL = "UPDATE users SET user_name = ? WHERE user_id = ?";
		int rowEffect = 0;
		try {
			rowEffect = runner.update(SQL, user_name, user_id);
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
	public boolean updatePassword(String user_id, String user_password) {
		String SQL = "UPDATE users SET user_password = ? WHERE user_id = ?";
		int rowEffect = 0;
		try {
			rowEffect = runner.update(SQL, user_password, user_id);
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
	public boolean updateScore(String user_id, int score) {
		String SQL = "UPDATE users SET user_score = ? WHERE user_id = ?";
		int rowEffect = 0;
		try {
			rowEffect = runner.update(SQL, score, user_id);
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
	public boolean updateImageURL(String user_id, String image_url) {
		String SQL = "UPDATE users SET image_url = ? WHERE user_id = ?";
		int rowEffect = 0;
		try {
			rowEffect = runner.update(SQL, image_url, user_id);
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
	public boolean exist(String phonenumber) {
		if (getByPhoneNumber(phonenumber) == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public List<User> getAll(int start, int num) {
		String SQL = "SELECT * FROM users LIMIT ?,?";
		try {
			return runner.query(SQL, new BeanListHandler<User>(User.class),
					start, num);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public User getByID(String user_id) {
		String SQL = "SELECT * FROM users WHERE user_id = ?";
		try {
			return runner
					.query(SQL, new BeanHandler<User>(User.class), user_id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public User getByPhoneNumber(String phonenumber) {
		String SQL = "SELECT * FROM users WHERE user_phonenumber = ?";
		try {
			return runner.query(SQL, new BeanHandler<User>(User.class),
					phonenumber);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public long getCount() {
		String SQL = "SELECT COUNT('user_id') FROM users WHERE user_id not in (SELECT blacklist_id FROM blacklist)";
		try {
			return runner.query(SQL, new ScalarHandler<Long>());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0L;
	}

	@Override
	public List<User> getAllNotInBlack(int start, int num) {
		String SQL = "SELECT * FROM users WHERE user_id not in(SELECT blacklist_id FROM blacklist) LIMIT ?,?";
		try {
			return runner.query(SQL, new BeanListHandler<User>(User.class),start,num);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
