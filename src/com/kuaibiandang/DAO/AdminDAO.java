package com.kuaibiandang.DAO;

import com.kuaibiandang.model.Admin;

public interface AdminDAO {
	
	/**
	 * 登录，返回admin实体类
	 * @param admin_name
	 * @param admin_password
	 * @return
	 */
	public Admin check(String admin_phone,String admin_password);
	
	/**
	 * 修改密码
	 */
	public boolean updatePhone(String admin_phone,String admin_password);
}
