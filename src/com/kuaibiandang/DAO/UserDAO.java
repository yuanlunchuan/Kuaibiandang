package com.kuaibiandang.DAO;

import java.util.List;

import com.kuaibiandang.model.User;

public interface UserDAO {
	
	/**
	 * 新增一个用户
	 * @param user
	 * @return
	 */
	public boolean addUser(User user);
	
	/**
	 * 删除一个用户
	 * @param user_id
	 * @return
	 */
	public boolean deleteUser(String user_id);
	
	/**
	 * 修改用户名
	 * @param user_id
	 * @param user_name
	 * @return
	 */
	public boolean updateUserName(String user_id,String user_name);
	
	/**
	 * 修改用户密码
	 * @param user_id
	 * @param user_password
	 * @return
	 */
	public boolean updatePassword(String user_id,String user_password);

	/**
	 * 修改积分
	 * @param user_id
	 * @param score
	 * @return
	 */
	public boolean updateScore(String user_id,int score);
	
	/**
	 * 修改图片
	 * @param user_id
	 * @param image_url
	 * @return
	 */
	public boolean updateImageURL(String user_id,String image_url);
	
	/**
	 * 判断这个手机号码的用户是否存在
	 * @param phonenumber
	 * @return
	 */
	public boolean exist(String phonenumber);
	
	/**
	 * 查询所有用户
	 * @param start
	 * @param num
	 * @return
	 */
	public List<User> getAll(int start,int num);
	
	/**
	 * 根据ID查找用户
	 * @param user_id
	 * @return
	 */
	public User getByID(String user_id);
	
	/**
	 * 根据电话号码查找用户
	 * @param phonenumber
	 * @return
	 */
	public User getByPhoneNumber(String phonenumber);
	
	/**
	 * 查询全部用户数量
	 * @return
	 */
	public long getCount();
	
	/**
	 * 查询所有没在黑名单里的用户
	 */
	public List<User> getAllNotInBlack(int start,int num);
}
