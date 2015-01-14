package com.kuaibiandang.tools;

public class IDJudge {
	/**
	 * 地址表A开头 ------> 1
	 * 商家B开头 -------->2
	 * 评论C开头 -------->3
	 * 菜品D开头 -------->4
	 * 消息M开头 -------->5
	 * 订单O开头 -------->6
	 * 送餐员S开头 ------->7
	 * 消费者U开头 ------->8
	 */
	public static int judge(String id){
		String judge = id.substring(0,1);
		switch(judge){
		case "A":return 1;
		case "B":return 2;
		case "C": return 3;
		case "D":return 4;
		case "M": return 5;
		case "O":return 6;
		case "S":return 7;
		case "U":return 8;
		default:return 0;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(IDJudge.judge("U12145"));
	}
}
