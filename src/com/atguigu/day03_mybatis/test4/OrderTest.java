package com.atguigu.day03_mybatis.test4;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class OrderTest {

	private static SqlSessionFactory factory = null;
	
	static {
		try {
			Reader reader = Resources.getResourceAsReader("conf.xml");
			factory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testGetOrder() {
		SqlSession sqlSession = factory.openSession(true);
		Order order = sqlSession.selectOne("com.atguigu.day03_mybatis.test4.OrderMapper.getOrder", 1);
		System.out.println(order);
	}
	
	@Test
	public void testGetOrder2() {
		SqlSession sqlSession = factory.openSession(true);
		Order order = sqlSession.selectOne("com.atguigu.day03_mybatis.test4.OrderMapper.getOrder2", 2);
		System.out.println(order);
	}
}
