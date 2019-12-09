package com.ty.Map.HashMap1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMap2 {
public static void main(String[] args) {
	HashMap<Integer,Student> h1=new HashMap<Integer,Student>();
	h1.put(21, new Student("Harsha",22));
	h1.put(25, new Student("supraja",25));
	h1.put(25, new Student("supraja",25));
	h1.put(null, null);
	h1.put(null, new Student("supraja",25));
	
	Collection<Student> c1=h1.values();
	for (Student student : c1) {
		System.out.println(student);
		
	}
	Set s=h1.keySet();
	System.out.println(s);
	System.out.println("--------");
	System.out.println(h1.size());
	System.out.println(h1.containsKey(21));
	System.out.println(h1.containsValue(new Student("supraja",25)));

}
}
