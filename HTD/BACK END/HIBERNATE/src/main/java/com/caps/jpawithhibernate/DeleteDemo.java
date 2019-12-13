package com.caps.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.caps.jpawithhibernate.dto.Movie;

public class DeleteDemo {

	public static void main(String[] args) {
		EntityManager entityManager=null;
		EntityTransaction transaction=null;

		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("JPADemo");
			entityManager=entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			transaction.begin();
			Movie record=entityManager.find(Movie.class, 102);
			entityManager.remove(record);
			System.out.println("Record deleted");
			transaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
	}

}
