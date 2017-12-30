package com.etcxm.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.etcxm.dao.IUserDao;
import com.etcxm.domain.User;
import com.etcxm.util.HibernateUtil;

public class UserDaoImpl implements IUserDao {

	@Override
	public void save(User u) {

//		4.获取Session
		Session session = HibernateUtil.getSession();
//		5.打开事务
		//------------------------------------------
		Transaction tx = session.getTransaction();
		tx.begin();
//		6.具体的DML操作
		session.save(u);
//		7.提交/回滚事务
		tx.commit();
		//------------------------------------------
//		8.关闭Session
		session.close();
//		


		
	}

	@Override
	public void update(User u) {
		
		Session session = HibernateUtil.getSession();
//		5.打开事务
		//------------------------------------------
		Transaction tx = session.getTransaction();
		tx.begin();
//		6.具体的DML操作
		session.update(u);
//		7.提交/回滚事务
		tx.commit();
		//------------------------------------------
//		8.关闭Session
		session.close();
//		9.关闭SessionFactory
		
	}

	@Override
	public void delete(User u) {
		Session session = HibernateUtil.getSession();
//		5.打开事务
		//------------------------------------------
		Transaction tx = session.getTransaction();
		tx.begin();
//		6.具体的DML操作
		session.delete(u);
//		7.提交/回滚事务
		tx.commit();
		//------------------------------------------
//		8.关闭Session
		session.close();
//		
		
	}

	@SuppressWarnings("deprecation")
	@Override
	public User get(Long id) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
//		5.具体的查询操作
	//	SELECT * From t_user WHERE id = ?
		User user =(User)session.get(User.class, id);
		
//		6.关闭Session
		session.close();


		return user;
	}

	@Override
	public List<User> listAll() {
		Session session = HibernateUtil.getSession();
//		5.具体的查询操作
	//	SELECT * From t_user
		String hql = "SELECT u FROM User u";
		Query query = session.createQuery(hql);
		List<User> list = query.list();
		
//		6.关闭Session
		session.close();

		return list;
	}

}
