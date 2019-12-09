package com.ty.thread.thread2;

public class TestThread2 {
	public static void main(String[] args) {
		System.out.println("thread starts");
		Thread2 t1=new Thread2();
		Thread t=new Thread(t1);
		t.start();
		System.out.println("thread stops");
	}

}
