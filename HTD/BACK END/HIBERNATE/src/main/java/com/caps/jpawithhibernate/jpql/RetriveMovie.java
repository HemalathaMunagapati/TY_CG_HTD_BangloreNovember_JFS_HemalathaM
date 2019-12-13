package com.caps.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.jpa.event.spi.jpa.ExtendedBeanManager.LifecycleListener;

import com.caps.jpawithhibernate.dto.Movie;

public class RetriveMovie {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("JPADemo");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		String jpql="from Movie";
		Query query=entityManager.createQuery(jpql);
		List<Movie> record=query.getResultList();
		for (Movie movie : record) {
			System.out.println("MOvie id:"+movie.getMid());
			System.out.println("Movie name:"+movie.getMname());
			System.out.println("Movie ratings:"+movie.getRatings());
		}
		entityManager.close();
	}

}
