package com.capgemini.jpawithhibernate.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.onetoone.EmployeeInfo;

public class TestManyToOne {
	public static void main(String[] args) {
		EmployeeInfo info = new EmployeeInfo();
		info.setEid(12);
		info.setName("Amit");
		info.setEmail("amit@gmail.com");
		info.setPassword("amit123");

		EmployeeExperience exp = new EmployeeExperience();
		exp.setExpid(11);
		exp.setCname("Invendis");
		exp.setNoOfYear(2);
		exp.setEmployee(info);

		EmployeeExperience exp1 = new EmployeeExperience();
		exp1.setExpid(22);
		exp.setCname("Tyss");
		exp1.setNoOfYear(3);
		exp1.setEmployee(info);

		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();

			transaction.begin();
			entityManager.persist(exp);
			entityManager.persist(exp1);
			System.out.println("Record saved");
			transaction.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			transaction.rollback();
		}
		entityManager.close();

	} // end of main method

}
