package com.set.hashSet;

import java.util.HashSet;

public class HashSet4 {
public static void main(String[] args) {
	HashSet<Person> h1=new HashSet();
	h1.add(new Person(12,"me"));
	h1.add(new Person(11,"meee"));
	h1.add(new Person(13,"mee"));
	h1.add(new Person(12,"me"));
	for(Person p:h1) {
		System.out.println(p.name+" and age is:"+p.age );
	}
}
}
