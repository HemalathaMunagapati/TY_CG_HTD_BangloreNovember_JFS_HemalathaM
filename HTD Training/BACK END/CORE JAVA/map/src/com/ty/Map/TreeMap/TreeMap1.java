package com.ty.Map.TreeMap;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap1 {
	public static void main(String[] args) {
		TreeMap<Integer,String> t1=new TreeMap();
		t1.put(23, "sukanya");
		t1.put(22, "devaki");
		t1.put(40, "rukku");
		Set<Map.Entry<Integer, String>> s=t1.entrySet();
		for (Map.Entry<Integer, String> entry : s) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			System.out.println("-------------------------");
			
		}
		Collection c1=t1.values();
//		t1.put(null, null); cannot take null values
		for (Object object : c1) {
			System.out.println(object);
		}
		System.out.println(t1.size());
		System.out.println(t1.isEmpty());
		System.out.println(t1.containsKey(23));
		System.out.println(t1.containsValue("devaki"));
		
		
		System.out.println(t1.get(40));
		
	}

}
