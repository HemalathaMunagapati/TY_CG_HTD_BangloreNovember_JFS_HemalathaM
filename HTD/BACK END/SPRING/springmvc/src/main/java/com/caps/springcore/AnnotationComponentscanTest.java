package com.caps.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.caps.springcore.beans.Pet;
import com.caps.springcore.config.ComponentScanConfig;

public class AnnotationComponentscanTest {
	public static void main(String[] args) {
		ApplicationContext context=
				new AnnotationConfigApplicationContext(ComponentScanConfig.class);
		Animal animal=context.getBean(Animal.class);
		animal.makeSound();
		
		Pet pet=context.getBean(Pet.class);
		pet.getAnimal().makeSound();
	}

}
