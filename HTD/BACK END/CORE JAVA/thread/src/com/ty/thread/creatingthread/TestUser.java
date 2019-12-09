package com.ty.thread.creatingthread;

public class TestUser {
	public static void main(String[] args) {
		System.out.println("main thread starts");
		PVR p=new PVR();
		User user=new User(p);
		user.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		p.happy();
		System.out.println("main thread ends");
		
	}

}
