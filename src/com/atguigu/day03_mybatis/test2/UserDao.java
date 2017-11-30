package com.atguigu.day03_mybatis.test2;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class UserDao {

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
	
	
	public void add(User user) {
		SqlSession sqlSession = factory.openSession(true);
		int insert = sqlSession.insert("com.atguigu.day03_mybatis.test2.UserMapper.addUser", user);
		System.out.println("id="+user.getId());
		//sqlSession.commit();
		System.out.println(insert);
		sqlSession.close();
	}
	
	public void delete(int id) {
		SqlSession sqlSession = factory.openSession(true);
		int delete = sqlSession.delete("com.atguigu.day03_mybatis.test2.UserMapper.deleteUser", id);
		System.out.println(delete);
		sqlSession.close();
	}
	
	public void udpate(User user) {
		SqlSession sqlSession = factory.openSession(true);
		int update = sqlSession.update("com.atguigu.day03_mybatis.test2.UserMapper.updateUser", user);
		System.out.println(update);
	}
	
	public User get(int id) {
		User user = null;
		SqlSession sqlSession = factory.openSession(true);
		user = sqlSession.selectOne("com.atguigu.day03_mybatis.test2.UserMapper.getUser", id);
		return user;
	}
	
	public List<User> getAll() {
		List<User> list = new ArrayList<User>();
		SqlSession sqlSession = factory.openSession(true);
		list = sqlSession.selectList("com.atguigu.day03_mybatis.test2.UserMapper.getAllUsers");
		return list;
	}
	
	public List<User> getUsersByName(String name) {
		List<User> list = new ArrayList<User>();
		SqlSession sqlSession = factory.openSession(true);
		list = sqlSession.selectList("com.atguigu.day03_mybatis.test2.UserMapper.getUsersByName", "%"+name+"%");
		return list;
	}
}
