package com.caps.jpiwithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.caps.jpawithhibernate.dto.Product;

public class GetReference {
	public static void main(String[] args) {
		Product product=new Product();
		product.setPid(101);
		product.setPname("fiama");
		EntityManager entityManager =null;
		EntityTransaction transaction =null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPADemo");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
//			Product pro=entityManager.find(Product.class, 10);
			Product pro=entityManager.getReference(Product.class, 101);
			 System.out.println(pro.getClass());
			System.out.println("id---"+pro.getPid());
			System.out.println("name---"+pro.getPname());
			System.out.println("record saved");
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
//		transaction.commit();
		entityManager.close();

	}

}
