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

@WebServlet("/addEmployee2")
public class AddEmployeeServlet extends HttpServlet {

	private EmployeeService service = new EmployeeServiceImpl();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);

		if (session != null) {
			// valid Session
			// get the Form Data
			int empId = Integer.parseInt(req.getParameter("empId"));
			String name = req.getParameter("name");
			int age = Integer.parseInt(req.getParameter("age"));
			double salary = Double.parseDouble(req.getParameter("salary"));
			String designation = req.getParameter("designation");
			String password = req.getParameter("password");

			EmployeeInfoBean employeeInfoBean = new EmployeeInfoBean();
			employeeInfoBean.setEmpId(empId);
			employeeInfoBean.setName(name);
			employeeInfoBean.setAge(age);
			employeeInfoBean.setSalary(salary);
			employeeInfoBean.setDesignation(designation);
			employeeInfoBean.setPassword(password);

			boolean isAdded = service.addEmployee(employeeInfoBean);
			if (isAdded) {
				req.setAttribute("msg", "Employee Record Inserted Successfully");
			} else {
				req.setAttribute("msg", "Unable to Insert Emmployee Record!..");
			}
			req.getRequestDispatcher("./addEmpJspForm.jsp").forward(req, resp);

		} else {
			// Invalid Session
			req.setAttribute("msg", "Please Login First...");
			req.getRequestDispatcher("./loginForm").forward(req, resp);

		}

	}// end of doGet()
}// end of class
