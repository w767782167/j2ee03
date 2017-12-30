package com.etcxm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etcxm.domain.TEmployee;
import com.etcxm.mapper.TEmployeeMapper;
import com.etcxm.page.PageResult;
import com.etcxm.query.QueryObject;
import com.etcxm.service.IEmployeeService;

import freemarker.core._RegexBuiltins.replace_reBI;

@Service
public class EmployeeServiceImpl  implements IEmployeeService {

	@Autowired
	private TEmployeeMapper dao;
	
	@Override
	public int save(TEmployee emp) {
		// TODO Auto-generated method stub
		
		return dao.insert(emp);
	}

	@Override
	public int update(TEmployee emp) {
		// TODO Auto-generated method stub
		return dao.updateByPrimaryKey(emp);
	}

	@Override
	public int delete(Long id) {
		// TODO Auto-generated method stub
		return dao.deleteByPrimaryKey(id);
	}

	@Override
	public TEmployee getOne(Long id) {
		// TODO Auto-generated method stub
		return dao.selectByPrimaryKey(id);
	}

	@Override
	public List<TEmployee> list() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public PageResult selectByPage(QueryObject qo) {
		// TODO Auto-generated method stub
		Long count = dao.queryByPageCount(qo);
		if(count>0){
			List<TEmployee> list = dao.queryByPageList(qo);
			return new PageResult(count, list);
		}else{
			return PageResult.EMPTY;
		}

	}

	@Override
	public TEmployee queryByLogin(String username, String password) {
		// TODO Auto-generated method stub
		//dao.queryByLogin(username,password);
		return dao.queryByLogin(username,password);
	}

}
