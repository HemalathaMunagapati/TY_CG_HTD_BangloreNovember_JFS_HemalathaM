package com.caps.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.caps.jpawithhibernate.dto.Movie;

public class RetrieveColumnMovie {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("JPADemo");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		String jpql="select mname from Movie";
		Query query=entityManager.createQuery(jpql);
		List<String> record=query.getResultList();
		for (String movie : record) {
			System.out.println(movie);
		}
		entityManager.close();
	}
}
