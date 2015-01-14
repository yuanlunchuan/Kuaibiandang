package com.kuaibiandang.service.Impl;

import java.sql.Timestamp;
import java.util.List;

import com.kuaibiandang.DAO.BlacklistDAO;
import com.kuaibiandang.DAO.UserDAO;
import com.kuaibiandang.DAO.Impl.BlacklistDAOImpl;
import com.kuaibiandang.DAO.Impl.UserDAOImpl;
import com.kuaibiandang.model.Blacklist;
import com.kuaibiandang.model.User;
import com.kuaibiandang.service.UserService;

public class UserServiceImpl implements UserService {
	
	private UserDAO userDao = new UserDAOImpl();
	private BlacklistDAO black = new BlacklistDAOImpl();
	@Override
	public List<User> getAll(int start,int num) {
		return userDao.getAll(start, num);
	}

	@Override
	public boolean deleteUser(String user_id) {
		return userDao.deleteUser(user_id);
	}

	@Override
	public boolean addBlack(String user_id) {
		User u = userDao.getByID(user_id);
		Blacklist b = new Blacklist(u.getUser_id(),new Timestamp(System.currentTimeMillis()),u.getUser_phonenumber());
		return black.addBlacklist(b);
	}

	@Override
	public long getCount() {
		return userDao.getCount();
	}

	@Override
	public List<User> getAllNotInBlack(int start,int num) {
		return userDao.getAllNotInBlack(start,num);
	}

	@Override
	public User findById(String user_id) {
		return userDao.getByID(user_id);
	}

	/**
	 * 由于user表中没有user的状态，只做简单的删除就行
	 */
	@Override
	public boolean deleteBlack(String user_id) {
		return black.deleteBlacklist(user_id);
	}
}
