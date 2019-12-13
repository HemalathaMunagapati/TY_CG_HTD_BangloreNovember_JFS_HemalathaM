package com.caps.jpawithhibernate.mappings.manytoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import com.caps.jpawithhibernate.mappings.onetoone.Employee_Info;

import lombok.Data;
@Data
@Entity
@Table(name="employee_experience")
public class Employee_Experience {
	@Id
	@Column
private int empid;
	@Column
private String cname;
	@Column
private int year;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="eid")
private Employee_Info emp;
}
