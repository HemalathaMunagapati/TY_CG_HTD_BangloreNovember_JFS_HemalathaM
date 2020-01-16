package com.capgemini.forestrymanagementjpahibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.forestrymanagementjpahibernate.dto.AdminBean;
import com.capgemini.forestrymanagementjpahibernate.dto.ContractBean;

public class AdminDaoImpl implements AdminDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("forest");

	public boolean signup(String eMail, String password) {
		if (eMail.equals(eMail) && password.equals(password)) {
			return true;
		}
		return false;
	}

	public boolean login(String eMail, String password) {
		if (eMail.equals("Hema123@gmail.com") && password.equals("Hema@123")) {
			return true;
		} else
			return false;
	}

	public boolean addClient(String email, AdminBean bean) {
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(bean);
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}

		entityManager.close();
		return true;
	}

	public boolean addScheduler(String email, AdminBean bean) {
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(bean);
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}

		entityManager.close();
		return true;
	}

	public boolean deleteClient(String email) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;

		try {
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			ContractBean contractBean = entityManager.find(ContractBean.class, email);
			entityManager.remove(contractBean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		entityManager.close();
		return false;
	}

	public boolean deleteScheduler(String email) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;

		try {
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			ContractBean contractBean = entityManager.find(ContractBean.class, email);
			entityManager.remove(contractBean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		entityManager.close();
		return false;
	}

}
