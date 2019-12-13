package com.caps.jpawithhibernate.mappings.onetoone;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

public class TestEmployee {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter employee details...");
//		Employee_Info employee=new Employee_Info();
//		System.out.println("Enter eid...");
//		employee.setEid(sc.nextInt());
//		System.out.println("Enter name...");
//		employee.setEname(sc.next());
//		System.out.println("Enter email...");
//		employee.setEmail(sc.next());
//		System.out.println("Enter password..");
//		employee.setPassword(sc.next());
//		
//		System.out.println("Enter employee others info details...");
//		Employee_OtherInfo employee1=new Employee_OtherInfo();
//		System.out.println("Enter id..");
//		employee1.setId(sc.nextInt());
//		System.out.println("Enter pancardno...");
//		employee1.setPan(sc.next());
//		System.out.println("Enter fathersname...");
//		employee1.setFathers_name(sc.next());
//		System.out.println("Enter mothersname...");
//		employee1.setMothers_name(sc.next());
//		employee1.setEmployee(employee);
		
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPADemo");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			Employee_Info emp=entityManager.find(Employee_Info.class,101 );
		System.out.println(emp.getOther().getFathers_name());	
//			entityManager.persist(employee1);
			
			System.out.println("record saved...");
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		entityManager.close();
		
	}

}
