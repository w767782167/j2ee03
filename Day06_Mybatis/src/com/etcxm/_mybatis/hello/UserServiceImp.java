package com.etcxm._mybatis.hello;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.sun.org.apache.regexp.internal.recompile;

public class UserServiceImp implements IUserService {

	//dao  mapper
	@Override
	public PageResult list(QueryObject qo) {
		// TODO Auto-generated method stub
		SqlSession session = MybatisUtils.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		
		
		//总条数
		Long count = mapper.selectByPageCount(qo);
		if(count > 0){
			//结果集
			List<User> users = mapper.selectByPage(qo);
			return new PageResult(count, users);
		}else{
			return PageResult.EMPTY;
		}
		
		//return null;
	}

}
