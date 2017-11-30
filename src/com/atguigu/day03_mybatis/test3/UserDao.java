package com.atguigu.day03_mybatis.test3;

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
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		System.out.println(mapper.getClass());
		int insert = mapper.insertUser(user);
		System.out.println(insert);
	}

	public void delete(int id) {
		SqlSession sqlSession = factory.openSession(true);
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		int deleteUser = mapper.deleteUser(id);
		System.out.println(deleteUser);
	}

	public void udpate(User user) {
		SqlSession sqlSession = factory.openSession(true);
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		int updateUser = mapper.updateUser(user);
		System.out.println(updateUser);
	}

	public User get(int id) {
		User user = null;
		SqlSession sqlSession = factory.openSession(true);
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		user = mapper.getUser(id);
		return user;
	}

	public List<User> getAll() {
		List<User> list = new ArrayList<User>();
		SqlSession sqlSession = factory.openSession(true);
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		list = mapper.getAllUser();
		return list;
	}
}
