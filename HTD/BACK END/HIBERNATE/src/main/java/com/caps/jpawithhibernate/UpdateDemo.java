package com.caps.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

import com.caps.jpawithhibernate.dto.Movie;

public class UpdateDemo {

	public static void main(String[] args) {
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPADemo");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			Movie movie=entityManager.find(Movie.class, 101);
			movie.setMname("Hum safar");
			System.out.println("record updated");
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		entityManager.close();


	}

}
