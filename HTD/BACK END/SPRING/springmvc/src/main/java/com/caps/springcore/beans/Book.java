package com.caps.springcore.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Book {
	private String name;
	@Autowired
	private Author author;
	public Book() {
		
	}
	public Book(String name, Author author) {
		super();
		this.name = name;
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	

}
