package com.ty.thread.creatingthread;

public class IRCTC {
	synchronized void confirmTicket() {
		for (int i = 0; i < 4; i++) {
			System.out.println(i);
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
	}
	}
	synchronized void journey() {
//		notify();
		System.out.println("notify has been called...");
		notifyAll();
	}
}
