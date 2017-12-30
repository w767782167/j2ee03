package com.etcxm._mybatis.hello;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class TestMapper {
	
	@Test //登录测试
	public void testLogin() throws Exception{
		SqlSession session = MybatisUtils.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
	
		//第一方式:使用Map
//		Map<String,Object> map = new HashMap<String,Object>();
//		map.put("username", "tom");
//		map.put("password", "122");
//		
	    //User user = mapper.login(map);
		
		//第二种方式:使用注解@Param
		User user = mapper.login("tom", "122");
		
	    System.out.println(user);
	    session.close();
	}
	
	@Test //动态SQL  foreach测试
	public void testQueryForeach() throws Exception{
		SqlSession session = MybatisUtils.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
	
		List<Long> list = new ArrayList();
		list.add(8L);
		list.add(9L);
		
	    List<User> users = mapper.queryForeach(list);
	    
	    for (User user : users) {
			System.out.println(user);
		}
	    
	    session.close();
		
		
	}
	
	@Test   //动态SQL set测试
	public void testUpdateBy() throws Exception{
		User u = new User();
		u.setUsername("rosemm");
		u.setId(2L);
		SqlSession session = MybatisUtils.openSession();
	
		UserMapper mapper = session.getMapper(UserMapper.class);
		mapper.updateBy(u);
		
		session.commit();
		session.close();
		System.out.println(u);
	}
	
	@Test   //动态SQL where测试
	public void testgetByCondition() throws Exception{
		SqlSession session = MybatisUtils.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		QueryObject qo = new QueryObject();
		qo.setKeywords("i");
		qo.setBeginAge(17);
		qo.setEndAge(30);
	    List<User> list = mapper.selectByCondition(qo);
	    
	    
	    for (User user : list) {
			System.out.println(user);
		}
	    
	    session.close();
		
		
	}
	
	
	
	
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
	    //List<User> list = session.selectList("com.etcxm._mybatis.hello.UserMapper.list");
		UserMapper mapper = session.getMapper(UserMapper.class);
	    List<User> list = mapper.list();
	    
	    
	    for (User user : list) {
			System.out.println(user);
		}
	    
	    session.close();
		
		
	}
	
	@Test
	public void testgetOne() throws Exception{
		SqlSession session = MybatisUtils.openSession();
		// 第一个参数  namespace+id     第二个参数 是User对象
	    //User u = (User)session.selectOne("com.etcxm._mybatis.hello.UserMapper.get", 1L);
		UserMapper mapper = session.getMapper(UserMapper.class);
		System.out.println(mapper.getClass());
		//$Proxy4 imp  Usermapper 
		User u = mapper.get(2L);
	    
	    session.close();
		System.out.println(u);
		
	}
	
	@Test
	public void testSave() throws Exception{
		User u = new User();
		u.setUsername("李思思");
		u.setPassword("8888");
		u.setAge(28);

		SqlSession session = MybatisUtils.openSession();
		
		
		// 第一个参数  namespace+id     第二个参数 是User对象
		//session.insert("com.etcxm._mybatis.hello.UserMapper.save", u);
		UserMapper mapper = session.getMapper(UserMapper.class);
		mapper.save(u);
		
		session.commit();
		session.close();
		System.out.println(u);
	}
	
	
	@Test
	public void testUpdate() throws Exception{
		User u = new User();
		u.setUsername("王文文");
		u.setPassword("4444");
		u.setAge(17);
		u.setId(2L);
		

		SqlSession session = MybatisUtils.openSession();
		
		
		//session.update("com.etcxm._mybatis.hello.UserMapper.update", u);
		
		UserMapper mapper = session.getMapper(UserMapper.class);
		mapper.update(u);
		
		session.commit();
		session.close();
		System.out.println(u);
	}
	
	
	

}
