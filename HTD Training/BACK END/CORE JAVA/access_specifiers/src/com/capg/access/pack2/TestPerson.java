package com.capg.access.pack2;

import com.capg.access.pack1.Person;
import static com.capg.access.pack1.Person.*;

public class TestPerson extends Person{

	public TestPerson(int n) {
		super(n);
	}
	public static void main(String[] args) {
		Person p1=new Person(4);
		Person.cost=200;
		p1.see();
		Person.sleep();
	}

}
