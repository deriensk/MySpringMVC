package com.javastud.springmvcweb.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.javastud.springmvcweb.model.User;


@Repository
//@Repository annotation, importing the DAOs into the DI container and
//also this annotation makes the unchecked exceptions (thrown from DAO methods) eligible for translation into Spring DataAccessException
public class UserDaoImpl implements UserDao{
	
	@Autowired //asking for bean, automatic dependency injection
	private DataSource dataSource;
	
	@Override
	public boolean validateUser(User user) {
		
		
		// TODO Auto-generated method stub
		
		try {
			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			
			String sql = "SELECT username FROM USER WHERE username = '" +   user.getUsername() +
					   "' AND PASSWORD = '" +   user.getPassword() + "'";      
			System.out.println(sql);
			
			String dbUsername =  jdbcTemplate.queryForObject(sql, String.class);
			if (dbUsername != null){
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}

}
