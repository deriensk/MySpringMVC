package com.javastud.springmvcweb.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="student")
public class Student {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="first_name", nullable=false)
	private String firstName;
	
	@Column(name="last_name", nullable=false)
	private String lastName;
	
	@Column(name="subject", nullable=false)
	private String subject;
	
	@Column(name="roll_no", nullable=false)
	private String rollNo;
	
	@Column(name="college_name", nullable=false)
	private String collegeName;
	
	@Column(name="fee")
	private Double fee;
	
	@Column(name="birth_date")
	private Date birthDate;
	
	@Column(name="image_name")
	private String imageName;
	
	@Transient //not to save in the database
	private MultipartFile file;
	
	
	
}
