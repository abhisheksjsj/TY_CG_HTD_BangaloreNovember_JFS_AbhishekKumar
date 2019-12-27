package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;

public class GetReference {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		 //Movie record = entityManager.find(Movie.class, 101);
		Movie record = entityManager.getReference(Movie.class, 101);
		System.out.println(record.getClass());
		
		System.out.println("----------------------------");
		System.out.println("Id of the Movie is " + record.getMid());
		System.out.println("Movie name is " + record.getMname());
		System.out.println("Movie Rating is " + record.getRating());
		entityManager.close();

	}// end of main method

} // end of the class
