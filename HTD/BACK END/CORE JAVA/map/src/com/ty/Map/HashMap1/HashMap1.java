package com.ty.Map.HashMap1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {
	public static void main(String[] args) {
		HashMap<Integer,String> h1=new HashMap<Integer,String>();
		h1.put(1, "hema");
		h1.put(1, "hema");
		h1.put(21, "harsha");
		h1.put(31, "hemalatha");
		h1.put(11, "harshi");
		Set<Map.Entry<Integer,String>> s1=h1.entrySet();
		
		for (Map.Entry<Integer, String> entry : s1) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			System.out.println("------------------");
			
		}
	}

}
