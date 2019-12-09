package com.ty.Map.TreeMap;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMap_ArrayList {
	public static void main(String[] args) {
		ArrayList<Student> a1=new ArrayList();
		a1.add(new Student("chintu",10));
		a1.add(new Student("chinnu",10));
		a1.add(new Student("cheeku",10));
		a1.add(new Student("bandlu",10));
		
		
		TreeMap<String,ArrayList> t1=new TreeMap<String,ArrayList>();
		t1.put("1st standard", a1);
		System.out.println(t1.get("1st standard"));
		System.out.println(t1.containsKey("1st standard"));
		System.out.println(t1.containsValue(new Student("chinnu",10)));
		
		
	}

}
