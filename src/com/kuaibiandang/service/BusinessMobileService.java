package com.kuaibiandang.service;

public interface BusinessMobileService {
	/**
	 * 根据手机号码获取商家状态
	 * @return 0表示待审核，1表示审核通过，2表示在黑名单,<b>负数表示不存在</b>
	 */
	public int getStatus(String phonenumber);
}
