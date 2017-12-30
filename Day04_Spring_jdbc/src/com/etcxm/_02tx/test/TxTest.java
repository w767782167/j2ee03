package com.etcxm._02tx.test;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import com.etcxm._02tx.service.IAccountService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration

public class TxTest {	
	
	@Autowired
	private IAccountService service;
	
	@Test
	public void test(){
		service.trans(10086L, 10010L, 1000);
	}
	
	

}
