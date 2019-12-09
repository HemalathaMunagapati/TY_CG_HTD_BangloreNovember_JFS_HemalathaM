package com.capg.access.pack1;

public class TestPerson {
	public static void main(String[] args) {
		Person p=new Person(4);
		Person.cost=100;
		p.see();
		Person.sleep();
	}

}
