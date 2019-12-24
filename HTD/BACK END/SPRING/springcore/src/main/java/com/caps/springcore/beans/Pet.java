package com.caps.springcore.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.caps.springcore.Animal;
@Component
public class Pet {
	private String name;
	@Autowired
	@Qualifier("dog")
	private Animal animal;
	public Pet() {
		
	}
	public Pet(String name, Animal animal) {
		super();
		this.name = name;
		this.animal = animal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

}
