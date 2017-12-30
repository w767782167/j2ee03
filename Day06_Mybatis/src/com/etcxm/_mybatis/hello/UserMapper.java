package com.etcxm._mybatis.hello;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UserMapper {
	//com.etcxm._mybatis.hello.UserMapper.save
	@Insert("insert into t_user(username,password,age) values(#{username},#{password},#{age})")
	@Options(keyColumn="id",keyProperty="id",useGeneratedKeys=true)
	void save(User u);
	//com.etcxm._mybatis.hello.UserMapper.update
	
	@Update(" update t_user set username=#{username},password=#{password},age=#{age} where id = #{id}")
	void update(User u);
	//com.etcxm._mybatis.hello.UserMapper.delete
	void delete(Long id);
	//com.etcxm._mybatis.hello.UserMapper.list
	List<User> list();
	//com.etcxm._mybatis.hello.UserMapper.get
	@Select("select id as d_id,username as d_username,password as d_password,age as d_age from t_user where id= #{id}")
	//@ResultMap("base_map")  来自xml的resultmap
	@Results({
		@Result(column="d_id",property="id"),
		@Result(column="d_username",property="username"),
		@Result(column="d_password",property="password"),
		@Result(column="d_age",property="age")
	})
	User get(Long id);
	
	//动态SQL
	List<User> selectByCondition(QueryObject qo);
	void updateBy(User u);
	
	List<User> queryForeach(List<Long> list);
	
	
	//高级查询和分页
	List<User> selectByPage(QueryObject qo);
	Long selectByPageCount(QueryObject qo);
	
	//登录
	//User login(Map<String,Object> map);
	
	User login(@Param("username")String username,@Param("password")String password);
	
}
