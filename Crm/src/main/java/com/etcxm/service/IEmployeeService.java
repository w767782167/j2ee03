package com.etcxm.service;

import java.util.List;

import com.etcxm.domain.TEmployee;
import com.etcxm.page.PageResult;
import com.etcxm.query.QueryObject;

public interface IEmployeeService {
	int save(TEmployee emp);
	int update(TEmployee emp);
	int delete(Long id);
	TEmployee getOne(Long id);
	List<TEmployee> list();
	
	PageResult selectByPage(QueryObject qo);
	TEmployee queryByLogin(String username, String password);
	
	
}
