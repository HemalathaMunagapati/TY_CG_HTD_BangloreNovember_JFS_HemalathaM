package com.ty.thread.creatingthread;

public class User extends Thread{
	PVR p;

	public User(PVR p) {
		super();
		this.p = p;
	}
	public void run() {
		p.confirmTicket();
		p.watching();
	}

}
