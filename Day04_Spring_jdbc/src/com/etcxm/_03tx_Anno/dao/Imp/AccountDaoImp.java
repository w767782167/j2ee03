package com.etcxm._03tx_Anno.dao.Imp;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.etcxm._03tx_Anno.dao.IAccountDao;


@Repository("accountDao")
public class AccountDaoImp implements IAccountDao{
	
	private JdbcTemplate jdbcTemplate;

	// 属性 dataSource
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void transOut(Long outId, int money) {
		// TODO Auto-generated method stub
		this.jdbcTemplate.update("UPDATE t_account SET balance = balance-? WHERE id = ?",money,outId);
	}

	@Override
	public void transIn(Long inId, int money) {
		// TODO Auto-generated method stub
		this.jdbcTemplate.update("UPDATE t_account SET balance = balance+? WHERE id = ?",money,inId);
	}

}
