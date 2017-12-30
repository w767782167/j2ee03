package com.etcxm.dao;

import java.util.List;

import com.etcxm.domain.User;

public interface IUserDao {
	public void save(User u);
	public void update(User u);
	public void delete(User u);
	public User get(Long id);
	public List<User> listAll();

}
