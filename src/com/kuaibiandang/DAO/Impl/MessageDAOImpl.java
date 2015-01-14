package com.kuaibiandang.DAO.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




import org.apache.commons.dbutils.QueryRunner;

import com.kuaibiandang.DAO.MessageDAO;
import com.kuaibiandang.model.Message;
import com.kuaibiandang.tools.DBUtils;

public class MessageDAOImpl implements MessageDAO {
	private QueryRunner runner = null;
	
	public MessageDAOImpl(){
		runner = new QueryRunner(DBUtils.getDataSource());
	}
	@Override
	public boolean addMessage(Message mess) {
		String SQL = "INSERT INRO messages values(?,?,?,?,?)";
		int rowEffect = 0;
		try {
			rowEffect = runner.update(SQL,mess.getMessage_id(),mess.getMessage_status(),mess.getMessage_role_id(),mess.getMessage_content(),mess.getMessage_time());
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
	public boolean deleteMessage(String message_id) {
		String SQL = "DELETE FROM messages WHERE message_id = ?";
		int rowEffect = 0 ;
		try {
			rowEffect= runner.update(SQL,message_id);
			if(rowEffect>0){
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
	public int getStatus(String message_id) {
		String SQL ="SELECT message_status FROM messages WHERE message_id = ?";
		Connection conn = DBUtils.getConn();
		PreparedStatement pstmt = null;
		ResultSet result = null;
		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, message_id);
			result = pstmt.executeQuery();
			if(result.next()){
				return result.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
				try {
					if(result!=null){
						result.close();
					}
					if(pstmt!=null){
						pstmt.close();
					}
					if(conn!=null) {
						conn.close();
					}
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		return -1;
	}
	@Override
	public String getRoleID(String message_id) {
		String SQL ="SELECT message_role_id FROM messages WHERE message_id = ?";
		Connection conn = DBUtils.getConn();
		PreparedStatement pstmt = null;
		ResultSet result = null;
		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, message_id);
			result = pstmt.executeQuery();
			if(result.next()){
				return result.getString(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
				try {
					if(result!=null){
						result.close();
					}
					if(pstmt!=null){
						pstmt.close();
					}
					if(conn!=null) {
						conn.close();
					}
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		return null;
	}
	@Override
	public Object[] getStatusRole(String message_id) {
		String SQL = "SELECT message_status,message_role_id FROM messages WHERE message_id = ?";
		Connection conn = DBUtils.getConn();
		PreparedStatement pstmt = null;
		ResultSet result = null;
		
		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, message_id);
			result = pstmt.executeQuery();
			if(result.next()){
				Object[] r = new Object[2];
				r[0] = result.getInt(1);
				r[1] = result.getString(2);
				return r;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
				try {
					if(result!=null){
						result.close();
					}
					if(pstmt!=null){
						pstmt.close();
					}
					if(conn!=null) {
						conn.close();
					}
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		return null;
	}

}
