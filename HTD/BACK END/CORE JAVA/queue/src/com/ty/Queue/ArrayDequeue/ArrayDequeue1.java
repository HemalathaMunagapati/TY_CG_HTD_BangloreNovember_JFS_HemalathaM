package com.ty.Queue.ArrayDequeue;

import java.util.ArrayDeque;

public class ArrayDequeue1 {
	public static void main(String[] args) {
		ArrayDeque a1=new ArrayDeque();
		a1.add(1);
		a1.add(2);
		System.out.println(a1);
		a1.addFirst(2);
        a1.addLast(6);
        System.out.println(a1);
        a1.remove();
        System.out.println(a1);
        System.out.println(a1.getFirst());
        System.out.println(a1.getLast());
        
        a1.offer(23);
        System.out.println(a1);
        a1.offerFirst(25);
        a1.offerLast(24);
        System.out.println(a1);
        
        
        
	}

}
