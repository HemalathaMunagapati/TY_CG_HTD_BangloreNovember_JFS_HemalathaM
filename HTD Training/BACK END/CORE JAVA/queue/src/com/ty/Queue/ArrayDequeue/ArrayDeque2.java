package com.ty.Queue.ArrayDequeue;

import java.util.ArrayDeque;

public class ArrayDeque2 {
	public static void main(String[] args) {
		ArrayDeque ad=new ArrayDeque();
//		ad.add(null); no null values
		ad.add(2);
		ad.add(2);
		System.out.println(ad);
		ad.offer(22);
		ad.offerLast(23);
		ad.offerFirst(24);
		ad.addFirst(3);
		ad.addLast(2);
		System.out.println(ad);
		ad.remove();
		ad.removeFirst();
		ad.removeFirstOccurrence(2);
		ad.removeLast();
		ad.removeLastOccurrence(2);
		System.out.println(ad);
		System.out.println(ad.getFirst());
		System.out.println(ad.getLast());
		
		
		
		
		ArrayDeque<String> ad1=new ArrayDeque();
		ad1.add("he");
		ad1.addFirst("ma");
		
		ad1.add("tha");
		ad1.addLast("la");
		System.out.println(ad1);
	
		ad1.offerFirst("latha");
		ad1.offerLast("rosh");
		ad1.offer("hema");
		System.out.println(ad1);
		
		System.out.println(ad1.getFirst());
		System.out.println(ad1.getLast());
		
		ad1.add("he");
		ad1.add("he");
		ad1.remove();
		ad1.removeFirst();
		System.out.println(ad1);
		ad1.removeLast();
		System.out.println(ad1);
		
		ad1.removeFirstOccurrence("hema");
		ad1.removeLastOccurrence("hema");
		
		System.out.println(ad1.peek());
		System.out.println(ad1.peekFirst());
		System.out.println(ad1.peekLast());
		System.out.println(ad1);
		
	}

}
