package com.etcxm._03tx_Anno.dao;

public interface IAccountDao {
	 
	public void transOut(Long outId,int money);
	
	public void transIn(Long inId,int money);

}
