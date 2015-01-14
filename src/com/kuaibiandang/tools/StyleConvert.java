package com.kuaibiandang.tools;

/**
 *类型转换
 *调用StyleConvert.convert("想转换的类型");
 *@return -1表示错误，一个也没有匹配上
 */
public class StyleConvert {
	public static int convert(String message) {
		switch (message) {
		case "套餐":
			return 0;
		case "盖浇":
			return 1;
		case "炒饭":
			return 2;
		case "面食":
			return 3;
		case "饮料":
			return 4;
		default:
			return -1;
		}
	}
}
