package com.kuaibiandang.DAO.Impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.kuaibiandang.DAO.AddressDAO;
import com.kuaibiandang.model.Address;
import com.kuaibiandang.tools.DBUtils;

public class AddressDAOImpl implements AddressDAO {
	private QueryRunner runner = null;
	public AddressDAOImpl(){
		runner = new QueryRunner(DBUtils.getDataSource());
	}
	
	@Override
	public boolean addAddress(Address add) {
		String SQL = "INSERT INTO addresses values(?,?,?,?,?)";
		int rowEffect = 0;
		try {
			rowEffect = runner.update(SQL, add.getAddress_id(),add.getUser_id(),add.getAddress_content(),add.getUser_phonenumber(),add.getUser_phonenumber_other());
			if(rowEffect>0){
				return true;
			}else {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteAddress(String address_id) {
		String SQL = "DELETE FROM addresses WHERE address_id = ?";
		int rowEffect = 0;
		try {
			rowEffect = runner.update(SQL, address_id);
			if(rowEffect >0){
				return true;
			}else {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Address> getAll(String user_id) {
		String SQL ="SELECT address_content,user_phonenumber,user_phonenumber_other FROM addresses WHERE user_id = ?";
		try {
			return runner.query(SQL, new BeanListHandler<Address>(Address.class),user_id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Address getByID(String address_id) {
		String SQL = "SELECT address_content,user_phonenumber,user_phonenumber_other FROM addresses WHERE address_id = ?";
		try {
			return runner.query(SQL, new BeanHandler<Address>(Address.class),address_id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean updateAdd(Address add) {
		String SQL = "UPDATE addresses SET address_content = ?,user_phonenumber = ?,user_phonenumber_other = ? WHERE address_id = ?";
		int rowEffect = 0;
		try {
			rowEffect = runner.update(SQL,add.getAddress_content(),add.getUser_phonenumber(),add.getUser_phonenumber_other(),add.getAddress_id());
			if(rowEffect>0){
				return true;
			}else {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateAddContent(String address_id, String address_content) {
		String SQL = "UPDATE addresses SET address_content = ? WHERE address_id = ?";
		int rowEffect = 0;
		try {
			rowEffect = runner.update(SQL,address_content,address_id);
			if(rowEffect>0){
				return true;
			}else {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateAddPhonenumber_Other(String address_id,
			String user_phonenumber_other) {
		String SQL = "UPDATE addresses SET user_phonenumber_other = ? WHERE address_id = ?";
		int rowEffect = 0;
		try {
			rowEffect = runner.update(SQL,user_phonenumber_other,address_id);
			if(rowEffect>0){
				return true;
			}else {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public String getAddContentByID(String address_id) {
		String SQL = "SELECT address_content FROM addresses WHERE address_id = ?";
		try {
			return runner.query(SQL,new ScalarHandler<String>(),address_id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
