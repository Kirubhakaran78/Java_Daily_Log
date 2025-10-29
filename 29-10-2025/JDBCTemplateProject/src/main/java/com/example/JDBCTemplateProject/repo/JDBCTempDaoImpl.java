package com.example.JDBCTemplateProject.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.JDBCTemplateProject.pojo.JDBCTemp;

@Repository
public class JDBCTempDaoImpl implements JDBCTempDao  {
	
	@Autowired
	public JdbcTemplate  jdbcTemplate;

	@Override
	public void saveEmp(String name, int age) {
		String sql="Insert into jdbcTempPrac (name,age) values (?,?)";
		jdbcTemplate.update(sql,name,age);
		
	}

	@Override
	public List<JDBCTemp> fetchAllEmp() {
		return jdbcTemplate.query("Select * from jdbcTempPrac",new JDBCTempRowMapper());
		  
	}
	
	@Override
	public JDBCTemp fetchById(int id) {
		String sql="select id,name,age from jdbcTempPrac where id=?";
		return jdbcTemplate.queryForObject(sql,new JDBCTempRowMapper(),id); 
	}

	@Override
	public void updateEmp(int id,String name, int age) {
		String sql="update jdbcTempPrac set name=?,age=? where id=?";
		jdbcTemplate.update(sql,name,age,id);
	}

	@Override
	public void deleteEmp(int id) {
		String sql="delete from jdbcTempPrac where id=?";
		jdbcTemplate.update(sql,id);
	}

	

}
