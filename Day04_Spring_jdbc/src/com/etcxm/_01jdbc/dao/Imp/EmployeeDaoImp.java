package com.etcxm._01jdbc.dao.Imp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.etcxm._01jdbc.dao.IEmployeeDao;
import com.etcxm._01jdbc.domain.Employee;

public class EmployeeDaoImp extends JdbcDaoSupport implements IEmployeeDao {
	
	/*private JdbcTemplate jdbcTemplate;
	
	//属性 dataSource
	public void setDataSource(DataSource dataSource) {
	   this.jdbcTemplate = new JdbcTemplate(dataSource);
	}*/

	
	@Override
	public void save(Employee emp) {
		// TODO Auto-generated method stub
		super.getJdbcTemplate().update(
				 "insert into t_employee(name, age) values (?, ?)",
				 emp.getName(),emp.getAge());
	}

	@Override
	public void update(Employee emp) {
		// TODO Auto-generated method stub
		/*this.jdbcTemplate.update(
				 "update t_employee set name = ?,age = ? where id = ?",
				 emp.getName(),emp.getAge(),emp.getId());*/
		
		
		super.getJdbcTemplate().update(
				 "update t_employee set name = ?,age = ? where id = ?",
				 emp.getName(),emp.getAge(),emp.getId());
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		/*this.jdbcTemplate.update(
				 "delete from t_employee where id = ?",
				 id);*/
	}

	@Override
	public Employee get(Long id) {
		// TODO Auto-generated method stub
		return null;
		//查询总条数
//		Integer count = this.jdbcTemplate.queryForObject("select count(*) from t_employee", Integer.class);
//		System.out.println(count);
		
//		方法2
		
		/*return this.jdbcTemplate.queryForObject("select * from t_employee where id = ?", new RowMapper<Employee>() {
					@Override
					public Employee mapRow(ResultSet rs, int rownum)
							throws SQLException {
						// TODO Auto-generated method stub
						Employee emp = new Employee();
						emp.setId(rs.getLong("id"));
						emp.setAge(rs.getInt("age"));
						emp.setName(rs.getString("name"));
						return emp;
					}
				}, id);*/
		
		
		
		
		
		
//		方法1:
		/*List<Employee> list =  this.jdbcTemplate.query("select * from t_employee where id = ?",  new RowMapper<Employee>() {
					@Override
					public Employee mapRow(ResultSet rs, int rownum)
							throws SQLException {
						// TODO Auto-generated method stub
						Employee emp = new Employee();
						emp.setId(rs.getLong("id"));
						emp.setAge(rs.getInt("age"));
						emp.setName(rs.getString("name"));
						return emp;
					}
				}, id);
		
		return list.size() == 1?list.get(0):null;*/
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		/*List<Employee> list = this.jdbcTemplate.query(
				"select * from t_employee", new RowMapper<Employee>() {
					@Override
					public Employee mapRow(ResultSet rs, int rownum)
							throws SQLException {
						// TODO Auto-generated method stub
						Employee emp = new Employee();
						emp.setId(rs.getLong("id"));
						emp.setAge(rs.getInt("age"));
						emp.setName(rs.getString("name"));
						return emp;
					}
				});

		return list;*/
		
		return null;
	}

}
