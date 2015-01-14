package com.kuaibiandang.service;

import java.util.List;

import com.kuaibiandang.model.User;

public interface UserService {
	
	/**
	 * 查询全部用户
	 * @return
	 */
	public List<User> getAll(int start,int num);
	
	/**
	 * 删除用户
	 * @param user_id
	 * @return
	 */
	public boolean deleteUser(String user_id);
	
	/**
	 * 加入黑名单
	 * @param user_id
	 * @param status
	 * @return
	 */
	public boolean addBlack(String user_id);
	
	/**
	 * 查询全部用户的数量
	 * @return
	 */
	public long getCount();
	
	/**
	 * 查询没在黑名单的用户
	 */
	public List<User> getAllNotInBlack(int start,int num);
	
	/**
	 * 根据ID查找用户
	 * @param user_id
	 * @return
	 */
	public User findById(String user_id);
	
	/**
	 * 移除黑名单
	 * @param user_id
	 * @return
	 */
	public boolean deleteBlack(String user_id);
}
