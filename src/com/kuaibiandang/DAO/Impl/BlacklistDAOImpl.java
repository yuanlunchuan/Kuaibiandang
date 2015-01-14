package com.kuaibiandang.DAO.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.kuaibiandang.DAO.BlacklistDAO;
import com.kuaibiandang.model.Blacklist;
import com.kuaibiandang.tools.DBUtils;

public class BlacklistDAOImpl implements BlacklistDAO {

	private QueryRunner runner = null;

	public BlacklistDAOImpl() {
		runner = new QueryRunner(DBUtils.getDataSource());
	}

	@Override
	public boolean addBlacklist(Blacklist black) {
		String SQL = "INSERT INTO blacklist values(?,?,?)";
		int rowEffect = 0;
		try {
			rowEffect = runner
					.update(SQL, black.getBlacklist_id(),
							black.getBlacklist_time(),
							black.getBlacklist_phonenumber());
			if (rowEffect > 0) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteBlacklist(String id) {
		String SQL = "DELETE FROM blacklist where blacklist_id =?";
		int rowEffect = 0;
		try {
			rowEffect = runner.update(SQL, id);
			if (rowEffect > 0) {
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
	public List<Blacklist> getAll(int roleid, int start, int num) {
		String SQL = "SELECT * FROM blacklist WHERE blacklist_id like ? LIMIT ?,?";
		try {
			switch (roleid) {
			case 1:
				return runner.query(SQL, new BeanListHandler<Blacklist>(
						Blacklist.class), "B%", start, num);
			case 2:
				return runner.query(SQL, new BeanListHandler<Blacklist>(
						Blacklist.class), "S%", start, num);
			case 3:
				return runner.query(SQL, new BeanListHandler<Blacklist>(
						Blacklist.class), "U%", start, num);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean hasBlacklist(String phonenumber) {
		Connection conn = DBUtils.getConn();
		PreparedStatement pstmt = null;
		ResultSet result = null;
		String SQL = "SELECT * FROM blacklist where blacklist_phonenumber =?";
		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, phonenumber);
			result = pstmt.executeQuery();
			if (result.next()) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (result != null) {
					result.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return false;
	}

	@Override
	public long getCount(int roleid) {
		String SQL = "SELECT COUNT(*) FROM blacklist WHERE blacklist_id like ?";
		try {
			switch (roleid) {
			case 1:
				return runner.query(SQL, new ScalarHandler<Long>(), "B%");
			case 2:
				return runner.query(SQL, new ScalarHandler<Long>(), "S%");
			case 3:
				return runner.query(SQL, new ScalarHandler<Long>(), "U%");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

}
