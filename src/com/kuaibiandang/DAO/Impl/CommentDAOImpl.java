package com.kuaibiandang.DAO.Impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.kuaibiandang.DAO.CommentDAO;
import com.kuaibiandang.model.Comment;
import com.kuaibiandang.tools.DBUtils;

public class CommentDAOImpl implements CommentDAO {
	
	private QueryRunner runner = null;
	public CommentDAOImpl(){
		runner = new QueryRunner(DBUtils.getDataSource());
	}
	
	@Override
	public boolean addComment(Comment comm) {
		String SQL = "INSERT INTO comments values(?,?,?,?,?)";
		int rowEffect = 0;
		try {
			rowEffect = runner.update(SQL,comm.getComment_id(),comm.getOrder_id(),comm.getRoleA_id(),comm.getRoleB_id());
			if(rowEffect >0){
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteComment(String comment_id) {
		String SQL = "DELETE FROM comments WHERE comment_id = ?";
		int rowEffect = 0;
		try {
			rowEffect = runner.update(SQL,comment_id);
			if(rowEffect >0){
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Comment> getAllByOrderID(String order_id) {
		String SQL = "SELECT * FROM comments WHERE order_id = ?";
		try {
			return runner.query(SQL, new BeanListHandler<Comment>(Comment.class),order_id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Comment> getAllByOrderIDRole(String order_id, String roleB_id) {
		String SQL = "SELECT * FROM comments WHERE order_id = ? and roleB_id = ?";
		try {
			runner.query(SQL, new BeanListHandler<Comment>(Comment.class),order_id,roleB_id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
