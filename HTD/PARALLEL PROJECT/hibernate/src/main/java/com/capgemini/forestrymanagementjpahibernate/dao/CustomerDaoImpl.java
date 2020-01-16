package com.capgemini.forestrymanagementjpahibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.forestrymanagementjpahibernate.dto.CustomerBean;

public class CustomerDaoImpl implements CustomerDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("forest");

	@SuppressWarnings("unchecked")
	public List<CustomerBean> getAllCustomers() {
		EntityManager entityManager = null;
		try {
			entityManager = entityManagerFactory.createEntityManager();
			String jpql = "from CustomerBean";
			Query query = entityManager.createQuery(jpql);
			List<CustomerBean> list = query.getResultList();
			if (list != null) {
				return list;
			} else {
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public CustomerBean getCustomer(int customerId) {
		try {
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			String jpql = "from CustomerBean where customerId=:customerId";
			Query query = entityManager.createQuery(jpql);
			query.setParameter("customerId", customerId);
			CustomerBean record = (CustomerBean) query.getSingleResult();
			if (record != null) {
				return record;
			} else {
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public boolean insertCustomer(CustomerBean user) {
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(user);
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}

		entityManager.close();
		return true;
	}

	public boolean deleteCustomer(int customerId) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;

		try {
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			CustomerBean customerBean = entityManager.find(CustomerBean.class, customerId);
			entityManager.remove(customerBean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		entityManager.close();
		return false;
	}

	public boolean updateCustomer(int customerId, String customerName) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;

		try {
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			String jpql = "UPDATE CustomerBean SET customerName=:customerName WHERE customerId=:customerId";
			Query query = entityManager.createQuery(jpql);
			query.setParameter("customerName", customerName);
			query.setParameter("customerId", customerId);
			int count = query.executeUpdate();
			transaction.commit();
			if (count > 0) {
				return true;
			} else {
				entityManager.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
