package com.ty.Queue.PriorityQueue;

import java.util.PriorityQueue;

public class PriorityQueue1 {
	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		pq.offer(34);
		pq.offer(23);
		pq.offer(43);
		pq.offer(32);
		System.out.println(pq);
		pq.remove();
	
		System.out.println(pq.element());
		System.out.println("-----");
		for (Object object : pq) {
			System.out.println(object);
		}
		System.out.println(pq.peek());
		pq.poll();
		System.out.println(pq);
	}

}
