package com.caps.dependencyinjection;

import com.caps.dependencyinjection.dao.Animal;
import com.caps.dependencyinjection.factory.AnimalFactory;

public class App {
public static void main(String[] args) {
	Animal animal=AnimalFactory.getAnimal();
	animal.makeSound();
}
} 										
