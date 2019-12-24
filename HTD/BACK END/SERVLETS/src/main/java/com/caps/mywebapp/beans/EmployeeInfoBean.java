package com.caps.mywebapp.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Employee_Info")
public class EmployeeInfoBean {
	@Id
	@Column(name="emp_id")
	private int empId;
	@Column(name="ename")
	private String eName;
	@Column
	private double salary;
	@Column
	private int age;
	@Column
	private String designation;
	@Column
	private String password;

}//End of class
