package com.capgemini.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.jpawithhibernate.dto.Movie;

public class Update {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();

		String jpql = "Update Movie SET mname='RaOne' where mid=101";
		Query query = entityManager.createQuery(jpql);
		int result = query.executeUpdate();
		if (result == 1) {
			System.out.println("Updated Successfully");
		} else {
			System.out.println("Not Updated Successfully");

		}
		transaction.commit();
	}

}
