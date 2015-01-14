package com.kuaibiandang.service;

import java.util.List;

import com.kuaibiandang.model.Business;

public interface BusinessService {

	/**
	 * 查询所有商家
	 * @param phonenumber 电话号码
	 * @param password 密码
	 * @return 成功为true，失败为false
	 */
	public boolean check(String phonenumber, String password);

	/**
	 * 查询所有商家
	 * @return
	 */
	public List<Business> getAll(int status,int start, int num);
	
	/**
	 * 得到商家的总数
	 * @return 商家的总数
	 */
	public long getCount(int status);
	
	/**
	 * 
	 * @param business_id
	 * @return
	 */
	public boolean deleteBusiness(String phonenumber);
	
	/**
	 * 加入黑名单
	 */
	public boolean addBlack(String business_id);
	
	/**
	 * 更新状态
	 * @param phonenumber
	 * @param status
	 * @return
	 */
	public boolean updateStatus(String business_id,int status);
	
}
