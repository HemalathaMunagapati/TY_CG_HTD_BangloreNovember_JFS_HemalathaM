package com.set.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet2 {
	public static void main(String[] args) {
		TreeSet<Student> ts=new TreeSet();
		ts.add(new Student("pandu",12));
		ts.add(new Student("gundu",22));
		ts.add(new Student("guldi",32));
		ts.add(new Student("pandu",12));
		
		Iterator<Student> itr=ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
