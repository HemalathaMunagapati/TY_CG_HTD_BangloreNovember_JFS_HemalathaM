package com.ty.thread.creatingthread;

public class User1 extends Thread{
IRCTC ic;

public User1(IRCTC ic) {
	super();
	this.ic = ic;
}
public void run() {
	ic.confirmTicket();
}
}
