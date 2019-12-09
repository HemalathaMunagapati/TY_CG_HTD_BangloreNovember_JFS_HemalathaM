package com.capg.access.pack1;

public class Person {
	public int no;
	public static double cost;
	public void see() {
		System.out.println("Person was seeing "+no);
	}
	public static void sleep() {
		System.out.println("no of persons sleeping with cost:"+cost);
	}

	public Person(int n){
		this.no=n;
		
	}
}
