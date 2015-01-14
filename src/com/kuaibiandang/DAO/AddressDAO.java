package com.kuaibiandang.DAO;

import java.util.List;

import com.kuaibiandang.model.Address;

public interface AddressDAO {
	
	/**
	 * 新增一个地址
	 * @param add Address 实体类
	 * @return 添加成功返回true，失败返回false
	 */
	public boolean addAddress(Address add);
	
	/**
	 * 删除一个地址
	 * @param address_id
	 * @return 删除成功返回真，失败返回false
	 */
	public boolean deleteAddress(String address_id);
	
	/**
	 * 查询某个用户的全部地址信息
	 * @param user_id 用户id
	 * @return
	 */
	public List<Address> getAll(String user_id);
	
	
	/**
	 * 根据id返回一个地址信息 
	 * @param address_id
	 * @return
	 */
	public Address getByID(String address_id);
	
	/**
	 * 根据address id 更新一个地址
	 */
	public boolean updateAdd(Address add);
	
	/**
	 * 更新地址内容
	 * @param address_id 
	 * @param address_content 地址内容
	 * @return
	 */
	public boolean updateAddContent(String address_id,String address_content);
	
	/**
	 * 更新地址的另一个手机号码信息（非绑定）
	 * @param address_id
	 * @param user_phonenumber_other
	 * @return
	 */
	public boolean updateAddPhonenumber_Other(String address_id, String user_phonenumber_other);
	
	/**
	 * 根据ID查询得到地址内容
	 * @param address_id
	 * @return
	 */
	public String getAddContentByID(String address_id);
}
