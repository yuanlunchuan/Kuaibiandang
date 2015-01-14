package com.kuaibiandang.DAO;

import java.util.List;

import com.kuaibiandang.model.Consumer;

public interface ConsumerDAO {

	/**
	 * 根据号码返回一个用户
	 * 
	 * @param phonenumber
	 * @return
	 */
	public Consumer findByPhonenumber(String phonenumber);

	/**
	 * 登陆检查
	 * 
	 * @param phonenumber
	 * @param password
	 * @return
	 */
	public boolean check(String phonenumber, String password);

	/**
	 * 添加用户
	 * 
	 * @param con
	 * @return
	 */
	public boolean addConsumer(Consumer con);

	/**
	 * 查询返回用户
	 * 
	 * @return
	 */
	public List<Consumer> getAll(int start, int num);
}
