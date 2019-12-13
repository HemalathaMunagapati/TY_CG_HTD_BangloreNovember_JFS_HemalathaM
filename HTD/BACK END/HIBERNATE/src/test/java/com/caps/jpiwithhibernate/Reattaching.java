package com.caps.jpiwithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.caps.jpawithhibernate.dto.Product;

public class Reattaching {
	public static void main(String[] args) {
		EntityManager entityManager =null;
		EntityTransaction transaction =null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPADemo");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			Product pro=entityManager.find(Product.class, 101);
			System.out.println(entityManager.contains(pro));
			 pro.setPname("Alexander");
			entityManager.detach(pro);
			System.out.println(entityManager.contains(pro));
			Product reattachPro=entityManager.merge(pro);
			 reattachPro.setPname("parryware");
//			Product pro=entityManager.getReference(Product.class, 101);
			
			System.out.println("record updated");
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
//		transaction.commit();
		entityManager.close();

	}

}
