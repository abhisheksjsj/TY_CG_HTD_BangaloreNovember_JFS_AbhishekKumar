package com.capgemini.mywebapp.servletsforjsps;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.mywebapp.beans.EmployeeInfoBean;
import com.capgemini.mywebapp.service.EmployeeService;
import com.capgemini.mywebapp.service.EmployeeServiceImpl;

@WebServlet("/updateEmployee2")
public class UpdateEmployeeServlet extends HttpServlet {
	private EmployeeService service = new EmployeeServiceImpl();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);

		if (session != null) {
			// Valid Session
			// Get the Form Data
			int empId = Integer.parseInt(req.getParameter("empId"));
			String name = req.getParameter("name");
			String ageVal = req.getParameter("age");
			String salaryVal = req.getParameter("salary");
			String designation = req.getParameter("designation");
			String password = req.getParameter("password");

			EmployeeInfoBean employeeInfoBean = new EmployeeInfoBean();
			employeeInfoBean.setEmpId(empId);
			employeeInfoBean.setName(name);
			if (ageVal != null && !ageVal.isEmpty()) {
				int age = Integer.parseInt(ageVal);
				employeeInfoBean.setAge(age);

			}
			if (salaryVal != null && !salaryVal.isEmpty()) {
				double salary = Double.parseDouble(salaryVal);
				employeeInfoBean.setSalary(salary);

			}
			employeeInfoBean.setDesignation(designation);
			employeeInfoBean.setPassword(password);

			boolean isUpdated = service.updateEmployee(employeeInfoBean);
			if (isUpdated) {
				req.setAttribute("msg", "Employee Details Updated Successfully...");
			} else {
				req.setAttribute("msg", "Update Failed!....Please Try Again!...");
			}
			req.getRequestDispatcher("./updateEmpJsp").forward(req, resp);

		} else {
			// Invalid Session
			req.setAttribute("msg", "Please Login First");
			req.getRequestDispatcher("./loginForm").forward(req, resp);

		}

	}// end of doPost()

}// end of class
