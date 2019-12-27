package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;

public class Reattaching {
	public static void main(String[] args) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			Movie record = entityManager.find(Movie.class, 101);

			// returns boolean value ie true because connection is established
			System.out.println(entityManager.contains(record));
			entityManager.detach(record); // removes connection from the DB using detach()

			// returns boolean value ie false because connection is removed
			System.out.println(entityManager.contains(record));
			// Again, if we are updating the records in the table,we are not getting updated
			// since the connection has been removed
			Movie reattachMovie = entityManager.merge(record);
			reattachMovie.setMname("Avengers");
			System.out.println("record updated");
			transaction.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			transaction.rollback();
		}
		entityManager.close();

	}

}
