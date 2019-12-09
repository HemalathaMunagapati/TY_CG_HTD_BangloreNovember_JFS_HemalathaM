package com.set.TreeSet;

import java.util.TreeSet;

public class TreeSet3 {
	public static void main(String[] args) {
		EmployeeName en=new EmployeeName();
		EmployeeId eid=new EmployeeId();
		TreeSet<Employee> ts=new TreeSet(eid);
		ts.add(new Employee("i",31));
		ts.add(new Employee("me",32));
		ts.add(new Employee("myself",313));
		
		for (Employee employee : ts) {
			System.out.println(employee);
		}
	}

}
