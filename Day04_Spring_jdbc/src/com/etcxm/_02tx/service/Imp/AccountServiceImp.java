package com.etcxm._02tx.service.Imp;

import lombok.Setter;

import com.etcxm._02tx.dao.IAccountDao;
import com.etcxm._02tx.service.IAccountService;

public class AccountServiceImp implements IAccountService {

	@Setter
	private IAccountDao dao;
	
	@Override
	public void trans(Long outId, Long inId, int money) {
		// TODO Auto-generated method stub
		dao.transOut(outId, money);
		System.out.println(1/0);//模拟停电
		dao.transIn(inId, money);
	}

}
