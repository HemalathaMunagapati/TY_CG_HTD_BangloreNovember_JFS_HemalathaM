package com.caps.jpawithhibernate.mappings.onetoone;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.caps.jpawithhibernate.mappings.manytomany.Training_info;
import com.caps.jpawithhibernate.mappings.manytoone.Employee_Experience;

import lombok.Data;
import lombok.EqualsAndHashCode.Exclude;

@Data
@Entity
@Table(name="employee_info")
public class Employee_Info {
	@Id
	@Column
	private int eid;
	@Column
	private String ename;
	@Column
	private String email;
	@Column
	private String password;
	@Exclude
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "employee")
	private Employee_OtherInfo other;
	@Exclude
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "emp")
	private Employee_Experience exp;
	@Exclude
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "elist")
	private List<Training_info> info;
	

}
