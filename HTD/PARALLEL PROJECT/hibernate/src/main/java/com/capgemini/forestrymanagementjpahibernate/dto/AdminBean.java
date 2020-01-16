package com.capgemini.forestrymanagementjpahibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Admin")
public class AdminBean {
	@Id
	@Column
	String email;
	@Column
	String password;
	@Column
	String role;

}
