package com.set.LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet2 {
	public static void main(String[] args) {
		LinkedHashSet<Employee> lhs=new LinkedHashSet();
		lhs.add(new Employee("rahul",22));
		lhs.add(new Employee("ravi",23));
		lhs.add(new Employee("ram",24));
		lhs.add(new Employee("rashi",25));
		lhs.add(new Employee("rashi",25));
		
		Iterator itr1=lhs.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
	}

}
