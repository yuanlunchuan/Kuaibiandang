package com.kuaibiandang.DAO;

import java.util.List;

import com.kuaibiandang.model.Business;
import com.kuaibiandang.model.BusinessShow;

public interface BusinessDAO {
	
	/**
	 * 登录方法check,<b>首先要判断是否在黑名单里</b>
	 * @param phonenumber
	 * @param password
	 * @return
	 */
	public Business check(String phonenumber, String password);
	
	/**
	 * 查询全部的商家
	 * @return 商家集合
	 */
	public List<Business> getAll(int status,int start, int num);
	
	/**
	 * 通过电话号码查询商家，返回商家对象
	 * @param phonenumber
	 * @return
	 */
	public Business findByPhonenumber(String phonenumber);
	
	/**
	 * 添加商家
	 * @param bus
	 * @return 添加成功返回true
	 */
	public boolean addBusiness(Business bus);
	
	/**
	 * 删除商家
	 * @param phonenumber 手机号码
	 * @return 删除成功返回true
	 */
	public boolean deleteBusiness(String phonenumber);
	
	/**
	 * 通过手机号码检索并更新商家，传入商家对象
	 * @param bus
	 * @return
	 */
	public boolean updateBusinessByPhonenumber(Business bus);
	
	
	/**
	 * 通过ID 查找商家
	 * @param ID
	 * @return
	 */
	public Business findByID(String ID);
	
	/**
	 * 通过ID检索出商家并更改商家的状态，用于审核商家
	 * @param business_id
	 * @param status
	 * @return
	 */
	public boolean updateBusinessStatusByID(String business_id,int status);
	
	/**
	 * 修改商家密码
	 * @param business_id 商家ID
	 * @param password  修改的密码
	 * @return
	 */
	public boolean updateBussinessPass(String business_id,String password);
	
	
	/**
	 * 查询出用于展示的商家信息
	 * @param status 商家的状态
	 */
	public List<BusinessShow> getShowBussiness(int status,int start,int num);
	
	/**
	 * 更新商家的好评率
	 */
	public boolean updateBusinessReputation (String business_id, Float reputation);
	
	/**
	 * 更新送餐员费用
	 * @param business_id 商家ID 
	 * @param sender_cost 送餐员费用
	 * @return
	 */
	public boolean updateSenderCost(String business_id, int sender_cost);
	
	/**
	 * 更新商家等级
	 * @param business_id 商家ID
	 * @param level 等级
	 * @return
	 */
	public boolean updateLevel(String business_id,int level);
	
	/**
	 * 查询商家的总数
	 * @return
	 */
	public long getCount(int status);
	
	/**
	 * 查询手机号码的状态,
	 * @return  0表示待审核，1表示审核通过，2表示在黑名单,<b>负数表示不存在</b>
	 */
	public int getStatus(String phonenumber);
	
}
