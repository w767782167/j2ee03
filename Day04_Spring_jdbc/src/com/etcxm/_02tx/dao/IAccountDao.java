package com.etcxm._02tx.dao;

public interface IAccountDao {
	 
	public void transOut(Long outId,int money);
	
	public void transIn(Long inId,int money);

}
