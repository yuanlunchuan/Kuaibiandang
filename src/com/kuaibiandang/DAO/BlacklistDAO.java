package com.kuaibiandang.DAO;

import java.util.List;

import com.kuaibiandang.model.Blacklist;

public interface BlacklistDAO {
	
	/**
	 * 增加一条黑名单记录
	 * @param 黑名单对象
	 * @return
	 */
	public boolean addBlacklist(Blacklist black);
	
	/**
	 * 根据手机号，删除一条黑名单记录
	 * @param blacklist_phonenumber
	 * @return
	 */
	public boolean deleteBlacklist(String id);
	
	/**
	 * 查询得到全部的黑名单
	 * @return
	 */
	public List<Blacklist> getAll(int roleid,int start,int num);
	
	/**
	 * 根据手机号查黑名单
	 * @param phonenumber
	 * @return
	 */
	public boolean hasBlacklist(String phonenumber);
	
	public long getCount(int roleid);
}
