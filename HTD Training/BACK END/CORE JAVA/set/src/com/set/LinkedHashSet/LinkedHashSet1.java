package com.set.LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {
	public static void main(String[] args) {
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add(3);
		lhs.add(13);
		lhs.add(23);
		lhs.add(33);
		lhs.add(null);
		lhs.add(null);
		Iterator itr=lhs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		LinkedHashSet<Integer> lhs1=new LinkedHashSet();
		lhs1.add(03);
		lhs1.add(9);
		lhs1.add(27);
		lhs1.add(51);
		
		lhs1.add(null);
		lhs1.add(null);
		Iterator itr1=lhs1.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}

}
