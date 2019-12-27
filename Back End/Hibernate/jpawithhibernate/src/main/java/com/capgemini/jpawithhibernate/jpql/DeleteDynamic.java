package com.capgemini.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteDynamic {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		String jpql = "Delete from Movie where mid=:id";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("id", 101);
		int result = query.executeUpdate();
		transaction.commit();
		System.out.println("Deleted Successfully");
		entityManager.close();

	}
}
