package com.ty.thread.creatingthread;

public class TestUser1 {

	public static void main(String[] args) {
		System.out.println("thread starts");
  IRCTC ic=new IRCTC();
  User1 user=new User1(ic);
  user.start();
  
  User1 user1=new User1(ic);
  user1.start();
  try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	e.printStackTrace();
}
  ic.journey();
  System.out.println("thread ends");
	}

}
