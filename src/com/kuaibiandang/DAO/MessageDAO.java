package com.kuaibiandang.DAO;

import com.kuaibiandang.model.Message;

public interface MessageDAO {
	
	/**
	 * 增加一条消息
	 * @param mess message 对象
	 */
	public boolean addMessage(Message mess);
	
	/**
	 * 删除一条消息
	 * @param message_id message的id
	 * @return
	 */
	public boolean deleteMessage(String message_id);
	
	/**
	 * 查询某条消息的状态
	 * @return 返回负数表示失败
	 */
	public int getStatus(String message_id);
	
	/**
	 * 查询某条消息的role_id
	 */
	public String getRoleID(String message_id);
	
	/**
	 * 返回一个数组
	 * @param message_id
	 * @return 返回一个二维数组,object[0]为状态，object[1]为角色ID
	 */
	public Object[] getStatusRole(String message_id);
}
