package com.capgemini.jpawithhibernate.manytomany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.onetoone.EmployeeInfo;

public class ManyToMany {
	public static void main(String[] args) {
		EmployeeInfo info = new EmployeeInfo();
		info.setEid(50);
		info.setName("Anil");
		info.setEmail("anil@gmail.com");
		info.setPassword("anil13");

		EmployeeInfo info1 = new EmployeeInfo();
		info1.setEid(60);
		info1.setName("Navin");
		info1.setEmail("navin@gmail.com");
		info1.setPassword("navin123");

		ArrayList<EmployeeInfo> aList = new ArrayList<EmployeeInfo>();
		aList.add(info);
		aList.add(info1);

		TrainingInfo tInfo = new TrainingInfo();
		tInfo.setTid(400);
		tInfo.setName("SAP FS");
		tInfo.setDuration(50);

		TrainingInfo tInfo1 = new TrainingInfo();
		tInfo.setTid(500);
		tInfo.setName("Python FS");
		tInfo.setDuration(60);

		tInfo.setEList(aList);
		tInfo1.setEList(aList);

		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();

			transaction.begin();
			entityManager.persist(tInfo);
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
