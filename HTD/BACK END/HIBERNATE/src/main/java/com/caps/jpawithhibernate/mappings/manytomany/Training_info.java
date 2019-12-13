package com.caps.jpawithhibernate.mappings.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.caps.jpawithhibernate.mappings.onetoone.Employee_Info;

import lombok.Data;
@Data
@Entity
@Table(name="trainig_info")
public class Training_info {
	@Id
	@Column
	private int tid;
	@Column
	private String tname;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="training_employee",joinColumns = @JoinColumn(name="tid"),
	inverseJoinColumns = @JoinColumn(name="eid"))
	private List<Employee_Info> elist;

}
