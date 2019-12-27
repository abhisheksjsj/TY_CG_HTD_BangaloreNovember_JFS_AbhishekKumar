package com.capgemini.mywebapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.mywebapp.beans.EmployeeInfoBean;

public class EmployeeDAOImpl implements EmployeeDAO {
	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");

	@Override
	public EmployeeInfoBean searchEmployee(int empId) {

		EntityManager manager = entityManagerFactory.createEntityManager();
		EmployeeInfoBean employeeInfoBean = manager.find(EmployeeInfoBean.class, empId);

		manager.close();

		return employeeInfoBean;
	}// end of searchEmployee

	@Override
	public EmployeeInfoBean authenticate(int empId, String password) {
		EntityManager manager = entityManagerFactory.createEntityManager();
		String jpql = "from EmployeeInfoBean where empId=:empId and password=:pwd";
		Query query = manager.createQuery(jpql);
		query.setParameter("empId", empId);
		query.setParameter("pwd", password);

		EmployeeInfoBean employeeInfoBean = null;
		try {
			employeeInfoBean = (EmployeeInfoBean) query.getSingleResult(); // throws an Exception if there is no value
		} catch (Exception e) {
			e.printStackTrace();
		}

		manager.close();

		return employeeInfoBean;

	}// end of authentication

	@Override
	public boolean addEmployee(EmployeeInfoBean employeeInfoBean) {
		boolean isAdded = false;

		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = null;
		try {
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(employeeInfoBean);
			transaction.commit();
			isAdded = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		manager.close();
		return isAdded;

	}// end of addEmployee()

	@Override
	public boolean deleteEmployee(int empId) {
		boolean isDeleted = false;

		EntityManager manager = entityManagerFactory.createEntityManager();
		EmployeeInfoBean employeeInfoBean = manager.find(EmployeeInfoBean.class, empId);
		EntityTransaction transaction = null;
		if (employeeInfoBean != null) {
			transaction = manager.getTransaction();
			transaction.begin();
			manager.remove(employeeInfoBean);
			transaction.commit();
			isDeleted = true;

		}
		manager.close();
		return isDeleted;

	}// end of deleteEmp()

	@Override
	public boolean updateEmployee(EmployeeInfoBean employeeInfoBean) {
		boolean isUpdated = false;

		EntityManager manager = entityManagerFactory.createEntityManager();
		EmployeeInfoBean existingEmployeeInfo = manager.find(EmployeeInfoBean.class, employeeInfoBean.getEmpId());

		EntityTransaction transaction = manager.getTransaction();

		if (existingEmployeeInfo != null) {
			transaction.begin();
			try {
				String newName = employeeInfoBean.getName().trim();
				if (newName != null && !newName.isEmpty()) {
					existingEmployeeInfo.setName(newName);
				}
				int newAge = employeeInfoBean.getAge();
				if (newAge > 18) {
					existingEmployeeInfo.setAge(newAge);
				}
				double newSalary = employeeInfoBean.getSalary();
				if (newSalary > 0) {
					existingEmployeeInfo.setSalary(newSalary);
				}
				String newDesignation = employeeInfoBean.getDesignation().trim();
				if (newDesignation != null && !newDesignation.isEmpty()) {
					existingEmployeeInfo.setDesignation(newDesignation);
				}
				String newPassword = employeeInfoBean.getPassword().trim();
				if (newPassword != null && !newPassword.isEmpty()) {
					existingEmployeeInfo.setPassword(newPassword);
				}
				transaction.commit();
				isUpdated = true;

			} catch (Exception e) {
				e.printStackTrace();
			}
		} // end of Outer if

		manager.close();
		
		return isUpdated;

	}// end of UpdateEmployee()

	@Override
	public List<EmployeeInfoBean> getAllEmployees() {
		EntityManager manager = entityManagerFactory.createEntityManager();
		String jpql = "from EmployeeInfoBean";
		Query query = manager.createQuery(jpql);
		List<EmployeeInfoBean> employeesList = query.getResultList();
		manager.close();

		return employeesList;
	}// end of getAllEmployees()

}// end of class
