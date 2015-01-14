package com.kuaibiandang.test;

import static org.junit.Assert.*;

import java.sql.Timestamp;

import org.junit.Test;

import com.kuaibiandang.DAO.ConsumerDAO;
import com.kuaibiandang.DAO.Impl.ConsumerDAOImpl;
import com.kuaibiandang.model.Consumer;

public class ConsumerTest {
	private ConsumerDAO conDao = new ConsumerDAOImpl();
	@Test
	public void testfind() {
		Consumer c = conDao.findByPhonenumber("13551031965");
		assertEquals("袁伦川", c.getUser_name());
	}
	
	@Test
	public void testcheck(){
		boolean temp = conDao.check("15756291319", "qwe");
		assertEquals(true, temp);
	}
	
	@Test
	public void testAdd(){
		Consumer c = new Consumer();
		c.setUser_id("123");
		c.setUser_name("123");
		c.setUser_password("123");
		c.setUser_registertime(new Timestamp(System.currentTimeMillis()));
		c.setUser_phonenumber("123");
		c.setUser_image_url("123");
		c.setUser_address("123");
		c.setUser_score(1);
		assertEquals(true, conDao.addConsumer(c));
	}
}
