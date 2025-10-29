package com.example.StoreJsonIntoTable.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.StoreJsonIntoTable.pojo.Analyst;

@Repository // marks class as Data access object (dao)
public class AnalystDaoImpl implements AnalystDao {

	
	@Autowired
	private DataSource datasource;
//DataSource is a Java interface that represents a connection pool to your database
	
	@Override
	public void save(Analyst analyst) {
		
		String sql="Insert into analysts(name,age) values (?,?)";
		
		try(Connection con=datasource.getConnection();
				PreparedStatement ps=con.prepareStatement(sql)){
			
			
			ps.setString(1, analyst.getName());
			ps.setInt(2, analyst.getAge());
			
			ps.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Analyst> findAll() {
		List<Analyst> analysts=new ArrayList<>();
		String sqlFetch="select id,name,age from analysts";
		
		try(Connection con=datasource.getConnection();
				PreparedStatement ps=con.prepareStatement(sqlFetch);
				ResultSet rs=ps.executeQuery()){
			
			while(rs.next()) {
				//Creates a new Analyst object to hold data from the current row
				Analyst analyst=new Analyst();
				
				analyst.setId(rs.getInt("id"));
				
				//Reads the name column and sets it
				analyst.setName(rs.getString("name"));
				
				analyst.setAge(rs.getInt("age"));
				
				analysts.add(analyst);
				
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return analysts; //return an list of Analyst Objects
	}

	
	
}
