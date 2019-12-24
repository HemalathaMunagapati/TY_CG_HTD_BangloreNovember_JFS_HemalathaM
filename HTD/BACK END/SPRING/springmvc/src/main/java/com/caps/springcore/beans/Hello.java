package com.caps.springcore.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Hello /* implements InitializingBean,DisposableBean */{
	private String msg;
	private int count;
	public Hello(String msg, int count) {
		super();
		this.msg = msg;
		this.count = count;
	}
	public Hello() {
		System.out.println("object created");
	}
	public void init() {
		System.out.println("init method");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("destroy state");
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	/* @Override */
//This method is for initializing phase
//	public void afterPropertiesSet() throws Exception {
//		System.out.println("afterPropertiesSet()");
//	}
	@PostConstruct
	public void inti() {
		System.out.println("init method");
	}


	
 
}
