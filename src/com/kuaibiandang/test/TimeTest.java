package com.kuaibiandang.test;

import java.util.UUID;

import com.kuaibiandang.tools.RandomID;

public class TimeTest {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.println(RandomID.getRandomID());
		}
	}
}
