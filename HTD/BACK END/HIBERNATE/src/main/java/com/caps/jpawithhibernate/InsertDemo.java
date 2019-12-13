package com.caps.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.caps.jpawithhibernate.dto.Movie;
import com.caps.jpawithhibernate.dto.Product;

public class InsertDemo {

	public static void main(String[] args) {
//		Movie movie =new Movie();
//		movie.setMid(104);
//		movie.setMname("Frozen");
//		movie.setRatings("excellent");
		Product product=new Product();
		product.setPid(102);
		product.setPname("himalaya");
		EntityManager entityManager =null;
		EntityTransaction transaction =null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPADemo");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(product);
			System.out.println("record saved");
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		transaction.commit();                                                		entityManager.close();

	}//end of the main method

}//end of the class
