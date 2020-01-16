package com.capgemini.forestrymanagementjpahibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.forestrymanagementjpahibernate.dto.ProductBean;

public class ProductDaoImpl implements ProductDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("forest");

	@SuppressWarnings("unchecked")
	public List<ProductBean> getAllProducts() {
		EntityManager entityManager = null;
		try {
			entityManager = entityManagerFactory.createEntityManager();
			String jpql = "from ProductBean";
			Query query = entityManager.createQuery(jpql);
			List<ProductBean> list = query.getResultList();
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

	public ProductBean getProduct(int productId) {
		try {
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			String jpql = "from ProductBean where productId=:productId";
			Query query = entityManager.createQuery(jpql);
			query.setParameter("productId", productId);
//			Integer i = query.executeUpdate();
			ProductBean record = (ProductBean) query.getSingleResult();
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

	public boolean insertProduct(ProductBean user) {
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

	public boolean deleteProduct(int productId) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;

		try {
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			ProductBean productBean = entityManager.find(ProductBean.class, productId);
			entityManager.remove(productBean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		entityManager.close();
		return false;
	}

	public boolean updateProduct(int productId, String productName) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;

		try {
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			String jpql = "UPDATE ProductBean SET productName=:productName WHERE productId=:productId";
			Query query = entityManager.createQuery(jpql);
			query.setParameter("productName", productName);
			query.setParameter("productId", productId);
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
