package com.ty.thread.creatingthread;

public class PVR {
 synchronized void confirmTicket() {
	
	System.out.println("Ticket is confirmed...dear!!!");
	try {
		wait();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
void watching() {
	for (int i = 0; i <4; i++) {
		System.out.println("movie is watching....");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
synchronized void happy() {
	System.out.println("yes...im ...!!");
	notify();
}
}
