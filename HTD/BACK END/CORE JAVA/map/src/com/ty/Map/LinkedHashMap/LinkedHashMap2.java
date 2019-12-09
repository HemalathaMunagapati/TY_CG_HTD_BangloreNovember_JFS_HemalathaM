package com.ty.Map.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import com.ty.Map.HashMap1.Student;

public class LinkedHashMap2 {
	public static void main(String[] args) {
		LinkedHashMap<Integer,Employee> l1=new LinkedHashMap<Integer,Employee>();
		l1.put(21, new Employee("Harsha",22));
		l1.put(25, new Employee("supraja",25));
		l1.put(25, new Employee("supraja",25));
		l1.put(null, null);
		l1.put(null, new Employee("supraja",25));
		System.out.println(l1.get(21));
		Set<Map.Entry<Integer,Employee>> s=l1.entrySet();
		for (Map.Entry<Integer, Employee> entry : s) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			System.out.println("-----------");
		}
		System.out.println(l1.size());
		System.out.println(l1.isEmpty());
		System.out.println(l1.containsKey(21));
		System.out.println(l1.containsValue(new Employee("supraja",25)));
		
		
	}

}
