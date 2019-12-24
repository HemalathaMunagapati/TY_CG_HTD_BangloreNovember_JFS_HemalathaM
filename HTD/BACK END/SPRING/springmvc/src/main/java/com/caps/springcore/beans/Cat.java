package com.caps.springcore.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.caps.springcore.Animal;
@Primary            
@Component
public class Cat implements Animal{
	@Override
	public void makeSound() {
		System.out.println("Meaooooo");
		
	}

}
