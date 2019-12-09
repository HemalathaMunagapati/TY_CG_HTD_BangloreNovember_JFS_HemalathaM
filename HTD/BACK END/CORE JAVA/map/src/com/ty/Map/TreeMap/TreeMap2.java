package com.ty.Map.TreeMap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap2 {
	public static void main(String[] args) {
		SortingAge s1=new SortingAge();
		TreeMap<Student,String> t1=new TreeMap(s1);
		
		t1.put(new Student("hema",22), "B.Tech");
		t1.put(new Student("hemalatha",21), "b.Tech");
		t1.put(new Student("suppu",23), "M.Tech");
		
		Set<Map.Entry<Student, String>> s=t1.entrySet();
		for (Map.Entry<Student, String> entry : s) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		System.out.println(t1.get(new Student("hema",22)));
		System.out.println(t1.containsValue("M.Tech"));
	}

}
