package com.kuaibiandang.tools;

public class Pager {
	/**
	 * 用于分页的工具类
	 */

	private int pageNow; // 当前页数
	private int pageSize; // /每页显示多少条
	private int totalPage; // 共有多少页
	private int totalSize; // 一共多少记录
	private int start;

	private boolean hasFirst; // 是否有首页
	private boolean hasPre; // 是否有下一页
	private boolean hasNext; // 是否有前一页
	private boolean hasLast; // 是否有最后一页
	
	/**
	 * 分页Pager构造方法
	 * @param pageNow 当前页数
	 * @param pageSize 每页记录数
	 * @param totalSize 总记录数，从数据库来
	 */
	public Pager(int pageNow, int pageSize, int totalSize) {
		this.pageNow = pageNow;
		this.pageSize = pageSize;
		this.totalSize = totalSize;
	}

	public int getPageNow() {
		return pageNow;
	}

	public void setPageNow(int pageNow) {
		this.pageNow = pageNow;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalPage() {
		if (totalSize % pageSize == 0) {
			return totalSize / pageSize;
		} else {
			return totalSize / pageSize + 1;
		}
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getTotalSize() {
		return totalSize;
	}

	public void setTotalSize(int totalSize) {
		this.totalSize = totalSize;
	}

	public boolean isHasFirst() {
		if (pageNow == 1) {
			return false;
		} else {
			return true;
		}
	}

	public void setHasFirst(boolean hasFirst) {
		this.hasFirst = hasFirst;
	}

	public boolean isHasPre() {
		if (this.hasFirst) {
			return true;
		} else {
			return false;
		}
	}

	public void setHasPre(boolean hasPre) {
		this.hasPre = hasPre;
	}

	public boolean isHasNext() {
		if (isHasLast()) {
			return true;
		} else {
			return false;
		}
	}

	public void setHasNext(boolean hasNext) {
		this.hasNext = hasNext;
	}

	public boolean isHasLast() {
		if (pageNow == this.getTotalPage()) {
			return true;
		} else {
			return false;
		}
	}

	public void setHasLast(boolean hasLast) {
		this.hasLast = hasLast;
	}

	public int getStart() {
		return (pageNow - 1) * pageSize;
	}

	public void setStart(int start) {
		this.start = start;
	}

}
