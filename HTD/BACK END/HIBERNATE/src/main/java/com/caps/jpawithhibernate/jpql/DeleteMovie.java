package com.caps.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.Transaction;

public class DeleteMovie {
	public static void main(String[] args) {
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPADemo");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			String jpql = "DELETE from Movie where mid=101";
			Query query = entityManager.createQuery(jpql);
			int count = query.executeUpdate();
			if (count > 0) {
				System.out.println("Record deleted");
			} else {
				System.out.println("sorry..!!something went wrong..");
			}
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		entityTransaction.rollback();
		entityManager.close();
	}

}
