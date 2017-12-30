package com.ectxm.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Setter;

import com.ectxm.domain.User;
import com.ectxm.mapper.UserMapper;
import com.ectxm.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
	private UserMapper mapper;
	
	@Override
	public void save(User u) {
		// TODO Auto-generated method stub
		mapper.save(u);
		System.out.println(1/0);
	}

}
