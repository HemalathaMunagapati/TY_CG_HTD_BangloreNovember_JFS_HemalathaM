package com.caps.dependencyinjection.factory;

import com.caps.dependencyinjection.dao.Animal;
import com.caps.dependencyinjection.dao.Dog;

public class AnimalFactory {
	private AnimalFactory() {
		
	}
public static Animal getAnimal() {
	return new Dog();
	
}
}
