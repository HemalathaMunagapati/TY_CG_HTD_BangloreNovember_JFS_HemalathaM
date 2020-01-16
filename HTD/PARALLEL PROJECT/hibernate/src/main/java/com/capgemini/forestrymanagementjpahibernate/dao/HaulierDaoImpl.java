package com.capgemini.forestrymanagementjpahibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.forestrymanagementjpahibernate.dto.HaulierBean;

public class HaulierDaoImpl implements HaulierDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("forest");

	@SuppressWarnings("unchecked")
	public List<HaulierBean> getAllHauliers() {
		EntityManager entityManager = null;
		try {
			entityManager = entityManagerFactory.createEntityManager();
			String jpql = "from HaulierBean";
			Query query = entityManager.createQuery(jpql);
			List<HaulierBean> list = query.getResultList();
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

	public HaulierBean getHaulier(int haulierId) {
		try {
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			String jpql = "from HaulierBean where haulierId=:haulierId";
			Query query = entityManager.createQuery(jpql);
			query.setParameter("haulierId", haulierId);
			HaulierBean record = (HaulierBean) query.getSingleResult();
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

	public boolean insertHaulier(HaulierBean user) {
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

	public boolean deleteHaulier(int haulierId) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;

		try {
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			HaulierBean haulierBean = entityManager.find(HaulierBean.class, haulierId);
			entityManager.remove(haulierBean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		entityManager.close();
		return false;
	}

	public boolean updateHaulier(int haulierId, String haulierName) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;

		try {
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			String jpql = "UPDATE HaulierBean SET haulierName=:haulierName WHERE haulierId=:haulierId";
			Query query = entityManager.createQuery(jpql);
			query.setParameter("haulierName", haulierName);
			query.setParameter("haulierId", haulierId);
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
