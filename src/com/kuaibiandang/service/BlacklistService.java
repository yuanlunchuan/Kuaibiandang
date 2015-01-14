package com.kuaibiandang.service;

import java.util.List;

import com.kuaibiandang.model.Blacklist;

public interface BlacklistService {
	/**
	 * 由于拉黑操作已经写在各个角色的service里，这里只写查询操作
	 */
	
	/**
	 * 查询黑名单
	 * @param roleid 角色ID，1 查询商家，2查询送餐员，3查询消费者
	 * @param start
	 * @param num
	 * @return
	 */
	public List<Blacklist> getAll(int roleid,int start,int num);
	
	/**
	 * 查询记录数
	 * @param roleid
	 * @return
	 */
	public long getCount(int roleid);
	
	/**
	 * 移除黑名单
	 * @param business_id
	 * @return
	 */
	public boolean deleteBlack(String business_id);
}
