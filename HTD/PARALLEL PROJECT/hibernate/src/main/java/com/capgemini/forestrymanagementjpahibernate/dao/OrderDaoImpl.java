package com.capgemini.forestrymanagementjpahibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.forestrymanagementjpahibernate.dto.OrderBean;

public class OrderDaoImpl implements OrderDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("forest");

	@SuppressWarnings("unchecked")
	public List<OrderBean> getAllOrders() {
		EntityManager entityManager = null;
		try {
			entityManager = entityManagerFactory.createEntityManager();
			String jpql = "from OrderBean";
			Query query = entityManager.createQuery(jpql);
			List<OrderBean> list = query.getResultList();
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

	public OrderBean getOrder(int orderNo) {
		try {
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			String jpql = "from OrderBean where orderNo=:orderNo";
			Query query = entityManager.createQuery(jpql);
			query.setParameter("orderNo", orderNo);
//			Integer i = query.executeUpdate();
			OrderBean record = (OrderBean) query.getSingleResult();
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

	public boolean insertOrder(OrderBean user) {
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

	public boolean deleteOrder(int orderNo) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;

		try {
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			OrderBean orderBean = entityManager.find(OrderBean.class, orderNo);
			entityManager.remove(orderBean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		entityManager.close();
		return false;
	}

	public boolean updateOrder(int orderNo, String deliveryDay) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;

		try {
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			String jpql = "UPDATE OrderBean SET deliveryDay=:deliveryDay WHERE orderNo=:orderNo";
			Query query = entityManager.createQuery(jpql);
			query.setParameter("deliveryDay", deliveryDay);
			query.setParameter("orderNo", orderNo);
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
