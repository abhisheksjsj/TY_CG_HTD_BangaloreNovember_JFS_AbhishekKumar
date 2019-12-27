package com.capgemini.jpawithhibernate.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestOnetoOne {
	public static void main(String[] args) {
//		EmployeeInfo info = new EmployeeInfo();
//		info.setEid(101);
//		info.setEmail("ram@yahoo.com");
//		info.setName("Ram");
//		info.setPassword("ram123");
//		EmployeeOtherInfo other = new EmployeeOtherInfo();
//		other.setId(99);
//		other.setFname("Dashrath");
//		other.setMname("kaushalya");
//		other.setPancard("mar123");
//		other.setEmployee(info);

		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			// entityManager.persist(other);
			EmployeeInfo info1 = entityManager.find(EmployeeInfo.class, 101);
			System.out.println(info1.getOther().getPancard());
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
