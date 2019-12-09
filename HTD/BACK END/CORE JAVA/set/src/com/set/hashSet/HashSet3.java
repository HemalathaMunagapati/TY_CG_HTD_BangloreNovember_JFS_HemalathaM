package com.set.hashSet;

import java.util.HashSet;

public class HashSet3 {
	public static void main(String[] args) {
		HashSet<Student> s1=new HashSet();
		s1.add(new Student("hema",21));
		s1.add(new Student("rosh",20));
		s1.add(new Student("keer",22));
		s1.add(new Student("hema",21));
		for(Student s:s1) {
			System.out.println(s.stName+"  and age is "+s.stAge);
		}
		
	}

}
