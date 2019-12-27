package com.capgemini.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Retrieve {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		// String jpql="from Movie";

		String jpql = "Select mname from Movie";
		Query query = entityManager.createQuery(jpql);
		List<String> record = query.getResultList();

		for (String movie : record) {
			// System.out.println("Movie Id is " + movie.getMid());
			// System.out.println("Movie name is " + movie.getMname());
			// System.out.println("Movie rating is " + movie.getRating());

			System.out.println(movie);
		}
		entityManager.close();

	}

}
