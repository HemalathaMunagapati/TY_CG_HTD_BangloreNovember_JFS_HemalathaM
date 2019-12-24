package com.caps.springcore.beans;

import org.springframework.stereotype.Component;

import com.caps.springcore.Animal;
 
@Component
public class Dog implements Animal{

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("baoo baooooo");
		
	}

}
