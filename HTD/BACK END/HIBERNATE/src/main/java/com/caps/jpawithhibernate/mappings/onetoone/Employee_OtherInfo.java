package com.caps.jpawithhibernate.mappings.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employee_otherinfo")
public class Employee_OtherInfo {
	@Id
	@Column
	private int id;
	@Column
	private String pan;
	@Column
	private String fathers_name;
	@Column
	private String mothers_name;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="eid")
	private Employee_Info employee;

}
