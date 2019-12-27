package com.capgemini.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateDynamic {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		String jpql = "Update Movie SET mname=:mn where mid=:id";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("id", 101);
		query.setParameter("mn", "Robot");
		int result = query.executeUpdate();
		System.out.println(result);
		transaction.commit();
		entityManager.close();
		System.out.println("Query Updated Successfully");
	}
}
