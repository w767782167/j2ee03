package com.ectxm.service.Impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ectxm.domain.User;
import com.ectxm.service.IUserService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml")

public class TestService {
	@Autowired
	IUserService service;
	
	@Test
	public void testSave(){
		//System.out.println(service);
		User u = new User();
		u.setUsername("李珊珊1");
		u.setPassword("5001");
		u.setAge(19);
				
	   service.save(u);
	}
	

}
