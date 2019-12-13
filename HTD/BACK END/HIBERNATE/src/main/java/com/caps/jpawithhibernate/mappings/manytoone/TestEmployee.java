package com.caps.jpawithhibernate.mappings.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.caps.jpawithhibernate.mappings.onetoone.Employee_Info;

public class TestEmployee {
	public static void main(String[] args) {
		Employee_Info emp=new Employee_Info();
		emp.setEid(10);
		emp.setEname("keerthi");
		emp.setEmail("keer@gmial.com");
		emp.setPassword("me@keer");
		
		Employee_Experience exp=new Employee_Experience();
		exp.setEmpid(3);
		exp.setCname("jfs");
		exp.setYear(2);
		
		Employee_Experience exp1=new Employee_Experience();
		exp1.setEmpid(4);
		exp1.setCname("stack");
		exp1.setYear(2);
		exp1.setEmp(emp);
		
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPADemo");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(exp);
			entityManager.persist(exp1);
			System.out.println("record saved...");
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		entityManager.close();
	}

}
