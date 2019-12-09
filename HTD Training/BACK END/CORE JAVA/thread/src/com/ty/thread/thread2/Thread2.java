package com.ty.thread.thread2;

public class Thread2 implements Runnable{
	public void run() {
		
		for (int i = 0; i < 4; i++) {
			
			System.out.println("running"+i);
		}
	}
	
}
