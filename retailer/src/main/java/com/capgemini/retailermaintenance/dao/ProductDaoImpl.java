package com.capgemini.retailermaintenance.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.retailermaintenance.dto.OrderInfo;
import com.capgemini.retailermaintenance.dto.ProductInfo;
import com.capgemini.retailermaintenance.dto.UserInfo;
import com.capgemini.retailermaintenance.exception.ProductsException;

@Repository
public class ProductDaoImpl implements ProductDao {

	@PersistenceUnit
	EntityManagerFactory factory;

	@Override
	public OrderInfo getOrders(int id) {
		EntityManager manager = factory.createEntityManager();
		OrderInfo orderInfo = manager.find(OrderInfo.class, id);
		return orderInfo;
	}

	@Override
	public boolean register(UserInfo account) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(account);
			transaction.commit();
			return true;
		} catch (Exception e) {
			throw new ProductsException("Account with same id already exists");
		}
	}

	@Override
	public UserInfo login(UserInfo credentials) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from UserInfo where email=:email";
		TypedQuery<UserInfo> query = manager.createQuery(jpql, UserInfo.class);
		query.setParameter("email", credentials.getEmail());
		try {
			UserInfo account = query.getSingleResult();
			if (account.getPassword().equals(credentials.getPassword())) {
				return account;
			} else {
				System.out.println("here above valid");
				return null;
			}
		} catch (Exception e) {
			throw new ProductsException("Account does not exist");
		}
	}

	@Override
	public ProductInfo getProducts(int id) {
		EntityManager manager = factory.createEntityManager();
		ProductInfo productInfo = manager.find(ProductInfo.class, id);
		return productInfo;
	}

	@Override
	public boolean changePassword(int id, String password) {
		EntityManager manager = factory.createEntityManager();
		UserInfo userInfo = manager.find(UserInfo.class, id);
		EntityTransaction transaction = manager.getTransaction();
		if (userInfo != null) {
			transaction.begin();
			userInfo.setPassword(password);
			transaction.commit();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean addProduct(ProductInfo product) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(product);
			transaction.commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean addOrder(OrderInfo order) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(order);
			transaction.commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean addUser(UserInfo user) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(user);
			transaction.commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
