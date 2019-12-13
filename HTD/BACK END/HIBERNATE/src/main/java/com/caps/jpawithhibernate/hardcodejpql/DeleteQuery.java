package com.caps.jpawithhibernate.hardcodejpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteQuery {
	public static void main(String[] args) {
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPADemo");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			String jpql = "DELETE from Movie where mid=:id";
			Query query = entityManager.createQuery(jpql);
			query.setParameter("id", 102);
			int count = query.executeUpdate();
			if (count > 0) {
				System.out.println("query deleted");
			} else {
				System.out.println("sorry....!!something went wrong..");
			}
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
	
		entityManager.close();
	}

}
