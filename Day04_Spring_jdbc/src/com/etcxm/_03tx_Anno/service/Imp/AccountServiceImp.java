package com.etcxm._03tx_Anno.service.Imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.etcxm._03tx_Anno.dao.IAccountDao;
import com.etcxm._03tx_Anno.service.IAccountService;

import lombok.Setter;


@Service("accountService")
@Transactional
public class AccountServiceImp implements IAccountService {

	@Autowired
	private IAccountDao dao;
	
	@Override
	//@Transactional
	public void trans(Long outId, Long inId, int money) {
		// TODO Auto-generated method stub
		dao.transOut(outId, money);
		System.out.println(1/0);//模拟停电
		dao.transIn(inId, money);
	}

}
