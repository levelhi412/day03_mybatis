package com.atguigu.day03_mybatis.test5;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class OMTest {

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
	public void testOM() {
		SqlSession sqlSession = factory.openSession();
		Classes c = sqlSession.selectOne("com.atguigu.day03_mybatis.test5.OOMapper.getClass3", 1);
		System.out.println(c);
	}
	
	
	
	@Test
	public void testOM2() {
		SqlSession sqlSession = factory.openSession();
		Classes c = sqlSession.selectOne("com.atguigu.day03_mybatis.test5.OOMapper.getClass4", 1);
		System.out.println(c);
	}
}
