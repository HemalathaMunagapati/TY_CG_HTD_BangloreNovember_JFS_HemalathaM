package com.ty.Map.LinkedHashMap;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMap1 {
	public static void main(String[] args) {
		LinkedHashMap<String,Integer> l1=new LinkedHashMap<String,Integer>();
		l1.put("BTM", 7863647);
		l1.put("BTR", 73647);
		l1.put("Jayanagar", 786367);
		l1.remove("BTR");
		l1.put(null, null);
		l1.put(null, null);
		Collection c=l1.values();
		for (Object object : c) {
			System.out.println(object);
		}
		Set<Map.Entry<String,Integer>> s1=l1.entrySet();
		
		for (Map.Entry<String, Integer> entry : s1) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			System.out.println("-------");
			
		}
		System.out.println(l1.containsKey("BTM"));
		System.out.println(l1.containsValue(73647));
		System.out.println(l1.size());
		System.out.println(l1.isEmpty());
		Set s=l1.keySet();
		System.out.println(s);
	}

}
