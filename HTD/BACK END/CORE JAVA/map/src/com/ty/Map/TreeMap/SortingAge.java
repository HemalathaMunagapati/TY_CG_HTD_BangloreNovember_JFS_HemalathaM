package com.ty.Map.TreeMap;

import java.util.Comparator;

public class SortingAge implements Comparator<Student>{
int age;
String name;

	@Override
public String toString() {
	return "SortingAge [age=" + age + ", name=" + name + "]";
}
	public SortingAge() {
		
	}

	public SortingAge(int age, String name) {
	super();
	this.age = age;
	this.name = name;
}

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.age>o2.age) {
			return 1;
		}else if(o1.age<o2.age) {
			return -1;
		}
		else
			return 0;
	}

	
}
