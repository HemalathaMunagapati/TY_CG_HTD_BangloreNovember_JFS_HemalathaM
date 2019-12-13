package com.caps.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.caps.jpawithhibernate.dto.Movie;

public class ReadDemo {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("JPADemo");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Movie movie=entityManager.find(Movie.class,103);
		System.out.println("ID----"+movie.getMid());
		System.out.println("NAME----"+movie.getMname());
		System.out.println("RATING----"+movie.getRatings());
		entityManager.close();
	}

}
