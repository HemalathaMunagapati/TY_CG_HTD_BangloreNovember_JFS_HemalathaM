package com.ty.Queue.PriorityQueue;

import java.util.PriorityQueue;

public class PriorityQueue2 {
	public static void main(String[] args) {
		PriorityQueue p1=new PriorityQueue();
		p1.offer(new Student("hema", 21));
		p1.offer(new Student("latha", 22));
		p1.offer(new Student("rosh", 23));
		for (Object object : p1) {
			System.out.println(object);
		}
		
	}

}
