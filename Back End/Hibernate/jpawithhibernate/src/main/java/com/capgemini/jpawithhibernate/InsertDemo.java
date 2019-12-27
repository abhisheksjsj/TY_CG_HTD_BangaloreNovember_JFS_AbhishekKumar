package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;

public class InsertDemo {
	public static void main(String[] args) {

		Movie movie = new Movie();
		movie.setMid(101);
		movie.setMname("Ghazini");
		movie.setRating("Too Good");

		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			//create an Object of EntityManagerFactory using Persistence class by passing persistence unit name
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(movie);
			System.out.println("Record saved");
			transaction.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			transaction.rollback();
		}
		entityManager.close();

	} // end of main method

} // end of class
