package com.etcxm._mybatis.hello;

import org.junit.Test;

public class TestPage {
	
	@Test
	public void testpage(){
		QueryObject qo = new QueryObject();
		qo.setPage(2);
		qo.setRow(2);
		qo.setKeywords("o");
		
		IUserService service = new UserServiceImp();
		PageResult result = service.list(qo);
		
		System.out.println("总条数:"+result.getTotal());
		System.out.println("结果集:"+result.getRows());
				 
	}

}
