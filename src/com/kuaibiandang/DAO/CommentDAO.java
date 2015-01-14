package com.kuaibiandang.DAO;

import java.util.List;

import com.kuaibiandang.model.Comment;

public interface CommentDAO {
	
	/**
	 * 新增一条评论
	 * @param comm
	 * @return 成功返回true，失败返回false
	 */
	public boolean addComment(Comment comm);
	
	/**
	 * 删除一条评论
	 * @return
	 */
	public boolean deleteComment(String comment_id);
	
	/**
	 * 根据订单查询全部评价
	 */
	public List<Comment> getAllByOrderID(String order_id);
	
	/**
	 * 根据订单和角色B查询评价
	 */
	public List<Comment> getAllByOrderIDRole(String order_id,String roleB_id);
	
}
