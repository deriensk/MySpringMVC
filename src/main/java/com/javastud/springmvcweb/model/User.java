package com.javastud.springmvcweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Entity
@Table(name="user")
@ToString
@Data
public class User {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="username", nullable=false)
	private String username;
	
	@Column(name="password", length=100)
	private String password;
	
	public User(){
		
	}

	
	
	
	

}
