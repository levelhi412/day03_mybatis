package com.atguigu.day03_mybatis.test2;

import java.util.List;

import org.junit.Test;


public class UserDaoTest {

	@Test
	public void testAdd() {
		UserDao dao = new UserDao();
		dao.add(new User(-1, "ket2", 24));
	}
	
	@Test
	public void testUpdate() {
		UserDao dao = new UserDao();
		dao.udpate(new User(3, "ket4444", 44));
	}
	
	@Test
	public void testDelete() {
		UserDao dao = new UserDao();
		dao.delete(3);
	}
	
	@Test
	public void testGet() {
		UserDao dao = new UserDao();
		User user = dao.get(2);
		System.out.println(user);
	}
	
	@Test
	public void testgetAll() {
		UserDao dao = new UserDao();
		List<User> list = dao.getAll();
		System.out.println(list);
	}
	
	@Test
	public void testGetUsersByname() {
		UserDao dao = new UserDao();
		List<User> list = dao.getUsersByName("t");
		System.out.println(list);
	}
	
	
	
}
