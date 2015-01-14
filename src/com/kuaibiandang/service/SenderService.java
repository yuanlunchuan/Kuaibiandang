package com.kuaibiandang.service;

import java.util.List;

import com.kuaibiandang.model.Sender;

public interface SenderService {

	/**
	 * 根据状态查询送餐员
	 * 
	 * @param status
	 * @param start
	 * @param num
	 * @return
	 */
	public List<Sender> getAllByStatus(int status, int start, int num);

	/**
	 * 更新送餐员状态
	 * @param sender_id
	 * @param status
	 * @return
	 */
	public boolean updateStatus(String sender_id, int status);
	
	/**
	 * 删除送餐员
	 * @param sender_id
	 * @return
	 */
	public boolean deleteSender(String sender_id);
	
	/**
	 * 根据状态查询送餐员数量
	 * @param status
	 * @return
	 */
	public long getCount(int status);
	
	/**
	 * 拉黑
	 * @param sender_id
	 * @return
	 */
	public boolean addBlack(String sender_id);
	
	/**
	 * 根据id查找送餐员
	 * @param sender_id
	 * @return
	 */
	public Sender findByID(String sender_id);
	
	/**
	 * 移除黑名单
	 */
	public boolean deleteBlack(String sender_id);
}
