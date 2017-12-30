package com.etcxm;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Test;

import com.etcxm.dao.IUserDao;
import com.etcxm.dao.impl.UserDaoImpl;
import com.etcxm.domain.User;

public class UserDaoTest {

	private IUserDao dao = new UserDaoImpl();
	@Test
	public void testSave() {
		User user = dao.get(1L);
		user.setSalary(BigDecimal.valueOf(10000.0));
		dao.save(user);
	}

	@Test
	public void testUpdate() {
		User user = dao.get(3L);
		user.setName("张飞飞");
		dao.update(user);
	}

	@Test
	public void testDelete() {
		User user = dao.get(3L);
		dao.delete(user);
	}

	@Test
	public void testGet() {
		User user = dao.get(1L);
		System.out.println(user);
	}

	@Test
	public void testListAll() {
	    List<User> list = dao.listAll();
	    for (User user : list) {
			System.out.println(user);
		}
	}
		

}
