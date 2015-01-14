package com.kuaibiandang.test;

import com.kuaibiandang.tools.Pager;

public class PageTest {
	public static void main(String[] args) {
		Pager page = new Pager(2, 10, 25);
		System.out.println("总记录数"+page.getTotalSize());
		System.out.println("每页显示"+page.getPageSize());
		System.out.println("每页第一条记录"+page.getStart());
		System.out.println("总页数"+page.getTotalPage());
//		System.out.println("是否是最后一页"+page.isHasLast());
//		System.out.println("是否是第一页"+page.isHasFirst());
	}
}
