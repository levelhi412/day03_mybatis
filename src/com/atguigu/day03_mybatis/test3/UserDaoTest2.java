package com.atguigu.day03_mybatis.test3;

import java.util.List;

import org.junit.Test;


public class UserDaoTest2 {

	@Test
	public void testAdd() {
		UserDao dao = new UserDao();
		dao.add(new User(-1, "TT", 21));
	}
	
	@Test
	public void testUpdate() {
		UserDao dao = new UserDao();
		dao.udpate(new User(5, "s55", 55));
	}
	
	@Test
	public void testDelete() {
		UserDao dao = new UserDao();
		dao.delete(5);
	}
	
	@Test
	public void testGet() {
		UserDao dao = new UserDao();
		User user = dao.get(6);
		System.out.println(user);
	}
	
	@Test
	public void testgetAll() {
		UserDao dao = new UserDao();
		List<User> list = dao.getAll();
		System.out.println(list);
	}
	
}
