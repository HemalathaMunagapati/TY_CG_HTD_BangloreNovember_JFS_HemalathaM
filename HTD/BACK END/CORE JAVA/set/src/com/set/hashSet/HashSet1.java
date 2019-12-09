package com.set.hashSet;

import java.util.HashSet;

public class HashSet1 {
public static void main(String[] args) {
	HashSet hs=new HashSet();
	hs.add(2);
	hs.add(3);
	hs.add(4);
	hs.add(5);
	hs.add(null);
	hs.add(null);
	for(Object o1:hs) {
		System.out.println(o1);
	}
	HashSet<String> hs1=new HashSet();
	hs1.add("hema");
	hs1.add("rosh");
	hs1.add("me");
	hs1.add(null);
	for(String s1:hs1) {
		System.out.println(s1);
	}
}
}
