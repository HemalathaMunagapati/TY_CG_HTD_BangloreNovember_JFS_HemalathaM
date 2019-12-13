package com.caps.jpawithhibernate.hardcodejpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateQuery {
public static void main(String[] args) {
	EntityManager entityManager=null;
	EntityTransaction transaction=null;
	EntityManagerFactory enituEntityManagerFactory=Persistence.createEntityManagerFactory("JPADemo");
	try {
		entityManager = enituEntityManagerFactory.createEntityManager();
		transaction = entityManager.getTransaction();
		transaction.begin();
		String jpql = "UPDATE Movie set mname=:nm where mid=:id";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("id", 102);
		query.setParameter("nm", "Four Knights");
		int count = query.executeUpdate();
		if (count > 0) {
			System.out.println("updated success...");
		} else {
			System.out.println("sorry...!!something went wrong");
		}
		transaction.commit();
	} catch (Exception e) {
		e.printStackTrace();
	}
	transaction.rollback();
	entityManager.close();
}
}
