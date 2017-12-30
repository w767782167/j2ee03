package com.etcxm._03tx_Anno.test;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.etcxm._03tx_Anno.service.IAccountService;




@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration

public class TxbyAnnoTest {	
	
	@Autowired
	private IAccountService service;
	
	@Test
	public void test(){
		service.trans(10086L, 10010L, 1000);
	}
	
	

}
