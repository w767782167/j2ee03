package com.etcxm._mybatis.hello;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class TestCURD {
	
	//com.etcxm._mybatis.hello.UserMapper.delete
	//com.etcxm._mybatis.hello.UserMapper.list
	//com.etcxm._mybatis.hello.UserMapper.get
	//com.etcxm._mybatis.hello.UserMapper.save
	//com.etcxm._mybatis.hello.UserMapper.update
	
	@Test
	public void testDelete() throws Exception{
		SqlSession session = MybatisUtils.openSession();
		// 第一个参数  namespace+id     第二个参数 是User对象
		//session.delete("com.etcxm._mybatis.hello.UserMapper.delete", 9L);
	    
		UserMapper mapper = session.getMapper(UserMapper.class);
	    mapper.delete(3L);
	    
		session.commit();
	    session.close();
		
		
	}
	
	@Test
	public void testgetAll() throws Exception{
		SqlSession session = MybatisUtils.openSession();
		// 第一个参数  namespace+id     第二个参数 是User对象
	    List<User> list = session.selectList("com.etcxm._mybatis.hello.UserMapper.list");	
	    
	    for (User user : list) {
			System.out.println(user);
		}
	    
	    session.close();
		
		
	}
	
	@Test
	public void testgetOne() throws Exception{
		SqlSession session = MybatisUtils.openSession();
		// 第一个参数  namespace+id     第二个参数 是User对象
	    User u = (User)session.selectOne("com.etcxm._mybatis.hello.UserMapper.get", 5L);
	    session.close();
		System.out.println(u);
		
	}
	
	@Test
	public void testSave() throws Exception{
		User u = new User();
		u.setUsername("lily");
		u.setPassword("333");
		u.setAge(18);

		SqlSession session = MybatisUtils.openSession();
		
		
		// 第一个参数  namespace+id     第二个参数 是User对象
		session.insert("com.etcxm._mybatis.hello.UserMapper.save", u);
		session.commit();
		session.close();
		System.out.println(u);
	}
	
	
	@Test
	public void testUpdate() throws Exception{
		User u = new User();
		u.setUsername("jack2");
		u.setPassword("222");
		u.setAge(37);
		u.setId(1L);
		

		SqlSession session = MybatisUtils.openSession();
		
		
		session.update("com.etcxm._mybatis.hello.UserMapper.update", u);
		
		session.commit();
		session.close();
		System.out.println(u);
	}
	
	
	

}
