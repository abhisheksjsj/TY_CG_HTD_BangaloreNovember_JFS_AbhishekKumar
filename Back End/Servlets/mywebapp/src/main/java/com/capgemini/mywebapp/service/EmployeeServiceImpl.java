package com.capgemini.mywebapp.service;

import java.util.List;

import com.capgemini.mywebapp.beans.EmployeeInfoBean;
import com.capgemini.mywebapp.dao.EmployeeDAO;
import com.capgemini.mywebapp.dao.EmployeeDAOImpl;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO dao = new EmployeeDAOImpl();

	@Override
	public EmployeeInfoBean searchEmployee(int empId) {
		return dao.searchEmployee(empId);

	}// end of searchEmployee()

	@Override
	public EmployeeInfoBean authenticate(int empId, String password) {
		return dao.authenticate(empId, password);
	}

	@Override
	public boolean deleteEmployee(int empId) {
		return dao.deleteEmployee(empId);
	}

	@Override
	public boolean addEmployee(EmployeeInfoBean employeeInfoBean) {
		return dao.addEmployee(employeeInfoBean);
	}

	@Override
	public boolean updateEmployee(EmployeeInfoBean employeeInfoBean) {
		return dao.updateEmployee(employeeInfoBean);
	}

	@Override
	public List<EmployeeInfoBean> getAllEmployees() {
		return dao.getAllEmployees();

	}

}// end of class
