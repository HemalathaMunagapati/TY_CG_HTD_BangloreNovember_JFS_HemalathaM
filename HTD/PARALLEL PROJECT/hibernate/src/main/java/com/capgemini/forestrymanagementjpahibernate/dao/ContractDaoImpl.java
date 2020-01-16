package com.capgemini.forestrymanagementjpahibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.forestrymanagementjpahibernate.dto.ContractBean;

public class ContractDaoImpl implements ContractDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("forest");

	@SuppressWarnings("unchecked")
	public List<ContractBean> getAllContracts() {
		EntityManager entityManager = null;
		try {
			entityManager = entityManagerFactory.createEntityManager();
			String jpql = "from ContractBean";
			Query query = entityManager.createQuery(jpql);
			List<ContractBean> list = query.getResultList();
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

	public ContractBean getContracter(int contractNo) {
		try {
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			String jpql = "from ContractBean where contractNo=:contractNo";
			Query query = entityManager.createQuery(jpql);
			query.setParameter("contractNo", contractNo);
			ContractBean record = (ContractBean) query.getSingleResult();
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

	public boolean insertContracter(ContractBean user) {
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

	public boolean deleteContract(int contractNo) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;

		try {
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			ContractBean contractBean = entityManager.find(ContractBean.class, contractNo);
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

	public boolean updateCustomerId(int contractNo, int customerId) {
		return false;
	}

	public boolean updateContract(int contractNo, String deliveryDate) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;

		try {
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			String jpql = "UPDATE ContractBean SET deliveryDate=:deliveryDate WHERE contractNo=:contractNo";
			Query query = entityManager.createQuery(jpql);
			query.setParameter("contractNo", contractNo);
			query.setParameter("deliveryDate", deliveryDate);
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
