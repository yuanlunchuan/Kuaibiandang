package com.kuaibiandang.tools;

import java.util.Random;
import java.util.UUID;

public class RandomID {
	/*
	 * 调用RandomID生成随机验证码
	 */
	public  static String TimeStamp(){
		String timestamp=String.valueOf(UUID.randomUUID().getLeastSignificantBits());
		return timestamp.substring(timestamp.length()-6);
	}
	public static  String RandomNumber(){
		Random random = new Random();
		String number =String.valueOf(random.nextInt());
		return number.substring(number.length()-4);
	}
	
	public static String getRandomID(){
		return TimeStamp()+ RandomNumber();
	}
	
}
