package com.caps.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateMovie {
	public static void main(String[] args) {
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPADemo");
			 entityManager = entityManagerFactory.createEntityManager();
			 transaction = entityManager.getTransaction();
			 transaction.begin();
			String jpql = "Update Movie set mname='Cinderella' where mid=104";
			Query query = entityManager.createQuery(jpql);
			int count=query.executeUpdate();
			if(count>0) {
				System.out.println("updated success...");
			}else {
			System.out.println("sorry..!!something went wrong..");
			}
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
        
		entityManager.close();
	}

}
