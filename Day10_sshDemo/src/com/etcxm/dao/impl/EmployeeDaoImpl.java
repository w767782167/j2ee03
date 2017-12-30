package com.etcxm.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.etcxm.dao.IEmployeeDao;
import com.etcxm.domain.Employee;

public class EmployeeDaoImpl  implements IEmployeeDao {

	private SessionFactory sessionFactory;

	//注入属性
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	@Override
	public void save(Employee emp) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();//这个不需要close
	    session.save(emp);
	}

	@Override
	public void update(Employee emp) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.update(emp);
	}

	@Override
	public void delete(Employee emp) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.delete(emp);
	}

	@Override
	public Employee get(Long id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return (Employee)session.get(Employee.class, id);
	}

	@Override
	public List<Employee> ListAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		String hql = "SELECT e FROM Employee e";
		Query query = session.createQuery(hql);
		return query.list();
	}

}
