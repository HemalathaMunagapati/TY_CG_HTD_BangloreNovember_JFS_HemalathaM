package com.set.TreeSet;

public class Employee implements Comparable<Employee> {
	String name;
	int id;
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
//	@Override
//	public int compareTo(Employee o) {
//		if(this.id>o.id) {
//			return -1;
//		}
//		else
//			return 1;
//	}
	@Override
//	public int compareTo(Employee o) {
//		
//		return this.name.compareTo(o.name);
//	}
	//@Override
	public int compareTo(Employee o) {
		
		return o.name.compareTo(this.name);
	}
	

}
