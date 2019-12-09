package com.ty.thread.thread1;

import thread.Thread1;

public class TestThread1 {
	public static void main(String[] args) {
		System.out.println("thread starts");
		Thread1 t1=new Thread1();
		t1.start();
		System.out.println("thread ends");
	}

}
