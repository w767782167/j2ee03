package com.etcxm.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.etcxm.dao.IUserDao;
import com.etcxm.domain.User;

public class UserDaoImpl_bak implements IUserDao {

	@Override
	public void save(User u) {
//		1.创建配置对象
//		2.读取配置文件
		Configuration config = new Configuration().configure();
//		3.创建SessionFactory
		SessionFactory sf = config.buildSessionFactory();
//		4.获取Session
		Session session = sf.openSession();
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
//		9.关闭SessionFactory
		sf.close();


		
	}

	@Override
	public void update(User u) {
//		1.创建配置对象
//		2.读取配置文件
		Configuration config = new Configuration().configure();
//		3.创建SessionFactory
		SessionFactory sf = config.buildSessionFactory();
//		4.获取Session
		Session session = sf.openSession();
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
		sf.close();	
	}

	@Override
	public void delete(User u) {
//		1.创建配置对象
//		2.读取配置文件
		Configuration config = new Configuration().configure();
//		3.创建SessionFactory
		SessionFactory sf = config.buildSessionFactory();
//		4.获取Session
		Session session = sf.openSession();
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
//		9.关闭SessionFactory
		sf.close();
		
	}

	@SuppressWarnings("deprecation")
	@Override
	public User get(Long id) {
		// TODO Auto-generated method stub
//     	1.创建配置对象
		Configuration config = new Configuration();
//		2.读取配置文件
		config.configure();
		
//		config.setProperty("hibernate.connection.username", "root");
//		config.setProperty("hibernate.connection.url", "jdbc:mysql:///hibernatedemo");
//		config.addClass(User.class);
		
//		3.创建SessionFactory:先看做是DataSource.
		SessionFactory sf = config.buildSessionFactory();
//		4.获取Session:             先看做是Connection.
		Session session = sf.openSession();
//		5.具体的查询操作
	//	SELECT * From t_user WHERE id = ?
		User user =(User)session.get(User.class, id);
		
//		6.关闭Session
		session.close();
//		7.关闭SessionFactory
		sf.close();

		return user;
	}

	@Override
	public List<User> listAll() {
//     	1.创建配置对象
		Configuration config = new Configuration();
//		2.读取配置文件
		config.configure();
//		3.创建SessionFactory:先看做是DataSource.
		SessionFactory sf = config.buildSessionFactory();
//		4.获取Session:             先看做是Connection.
		Session session = sf.openSession();
//		5.具体的查询操作
	//	SELECT * From t_user
		String hql = "SELECT u FROM User u";
		Query query = session.createQuery(hql);
		List<User> list = query.list();
		
//		6.关闭Session
		session.close();
//		7.关闭SessionFactory
		sf.close();
		return list;
	}

}
