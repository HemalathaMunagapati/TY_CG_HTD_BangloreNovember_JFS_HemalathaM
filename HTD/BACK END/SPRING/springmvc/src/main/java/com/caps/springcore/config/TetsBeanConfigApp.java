package com.caps.springcore.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.caps.springcore.Animal;
import com.caps.springcore.beans.Book;
import com.caps.springcore.beans.Cat;
import com.caps.springcore.beans.Dog;
import com.caps.springcore.beans.Hello;
import com.caps.springcore.beans.Pet;

public class TetsBeanConfigApp {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(BeansConfig.class);
	    Hello hello1=context.getBean(Hello.class);
	    System.out.println(hello1.getMsg());
	    System.out.println(hello1.getCount());
	    System.out.println("*********************************");
	    Hello hello2=context.getBean(Hello.class);
	    System.out.println(hello1);
	    System.out.println(hello2);
	    System.out.println(hello1==hello2);
	    System.out.println("*********************************");
//	    Dog dog=context.getBean(Dog.class);
//	    dog.makeSound();
	    Animal animal=context.getBean(Animal.class);
	    animal.makeSound();
//	    
//	    Cat cat=context.getBean(Cat.class);
//	    cat.makeSound();
	    
	    System.out.println("*********************************");
	    Pet pet=context.getBean(Pet.class);
	    System.out.println(pet.getName());
	    pet.getAnimal().makeSound();
	    
	    Book book=context.getBean(Book.class);
	    System.out.println(book.getName());
	    book.getAuthor().author();
	}

}
