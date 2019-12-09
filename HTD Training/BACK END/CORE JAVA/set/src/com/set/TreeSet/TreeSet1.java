package com.set.TreeSet;

import java.util.TreeSet;

public class TreeSet1 {
	public static void main(String[] args) {
		TreeSet td=new TreeSet();
		td.add(12);
		td.add(23);
		td.add(25);
		td.add(26);
//		td.add(null); //cannot add null values
		td.remove(12);
		for (Object object : td) {
			System.out.println(object);
		}
	}

}
