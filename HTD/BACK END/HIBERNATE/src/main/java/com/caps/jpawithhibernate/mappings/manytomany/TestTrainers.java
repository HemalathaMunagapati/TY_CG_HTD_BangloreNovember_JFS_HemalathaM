package com.caps.jpawithhibernate.mappings.manytomany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.caps.jpawithhibernate.mappings.onetoone.Employee_Info;

public class TestTrainers {
public static void main(String[] args) {
	
	Employee_Info emp=new Employee_Info();
	emp.setEid(21);
	emp.setEname("keer");
	emp.setEmail("keerkeer@gmial.com");
	emp.setPassword("me@keerQ1");
	
	Employee_Info emp1=new Employee_Info();
	emp1.setEid(12);
	emp1.setEname("hems");
	emp1.setEmail("hems12@gmail.com");
	emp1.setPassword("bro123");
	
	ArrayList<Employee_Info> array=new ArrayList<Employee_Info>();
	array.add(emp);
	array.add(emp1);
	
	Training_info tinfo=new Training_info();
	tinfo.setTid(25);
	tinfo.setTname("akhil");
	tinfo.setElist(array);
	
	EntityManager entityManager=null;
	EntityTransaction transaction=null;
	
	try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPADemo");
		entityManager = entityManagerFactory.createEntityManager();
		transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(tinfo);
		
		System.out.println("record saved...");
		transaction.commit();
	} catch (Exception e) {
		e.printStackTrace();
		transaction.rollback();
	}
	entityManager.close();

}
}
