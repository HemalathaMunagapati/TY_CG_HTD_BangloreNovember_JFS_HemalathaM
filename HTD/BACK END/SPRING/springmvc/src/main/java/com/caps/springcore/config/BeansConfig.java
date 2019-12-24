package com.caps.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.caps.springcore.beans.Author;
import com.caps.springcore.beans.Book;
import com.caps.springcore.beans.Cat;
import com.caps.springcore.beans.Dog;
import com.caps.springcore.beans.Hello;
import com.caps.springcore.beans.Pet;

@Configuration
public class BeansConfig {
	@Bean("hello")
	@Scope("prototype")
   public Hello getHello() {
	   Hello hello=new Hello();
	   hello.setMsg("I want to become something");
	   hello.setCount(10000000);
	   return hello;
   }
	
	@Bean(name="dog")
	public Dog getDog() {
		return new Dog();
	}
	@Primary
	@Bean("cat")
	public Cat getCat() {
		return new Cat();
	}
	
	@Bean(name="pet")
	public Pet getPet() {
		Pet pet=new Pet();
		pet.setName("snoopy");
//		pet.setAnimal(getDog());
		return pet;
	}
	@Bean("author")
	@Primary
	public Author getAuthor() {
		return new Author();
	}
	@Bean(name="book")
	public Book getBook() {
		Book book=new Book();
		book.setName("Three Mistakes Of My Life");
		book.setAuthor(getAuthor());
		return book;
	}
}
