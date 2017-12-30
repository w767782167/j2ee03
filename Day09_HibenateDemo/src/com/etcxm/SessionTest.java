package com.etcxm;

import org.hibernate.Session;
import org.junit.Test;

import com.etcxm.domain.User;
import com.etcxm.util.HibernateUtil;

public class SessionTest {
	
//	key                       value
//	com.etcxm.user2             session01 
//	com.etcxm.user4             session02
	//select * from t_user user0_ where user0_.uid=?

	@Test
	public void testOneCache(){
		Session session = HibernateUtil.getSession();
		session.get(User.class, 2L);
		System.out.println("------------------------");
		session.clear();//清除缓存
		session.get(User.class, 2L);
		session.close();
	}

}
