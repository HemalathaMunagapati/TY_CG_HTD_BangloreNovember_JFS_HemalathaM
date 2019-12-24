package com.caps.springcore.beans;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleTest {
public static void main(String[] args) {
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	Hello hello=context.getBean(Hello.class);
	System.out.println(hello.getMsg());
	System.out.println(hello.getCount());
	
	context.close();
	
}
}