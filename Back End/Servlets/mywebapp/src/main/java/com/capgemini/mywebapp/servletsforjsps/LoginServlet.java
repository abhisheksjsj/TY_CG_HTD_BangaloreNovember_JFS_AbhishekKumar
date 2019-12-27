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

@WebServlet("/login2")
public class LoginServlet extends HttpServlet {

	private EmployeeService service = new EmployeeServiceImpl();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int empId = Integer.parseInt(req.getParameter("empId"));
		String password = req.getParameter("password");

		EmployeeInfoBean employeeInfoBean = service.authenticate(empId, password);
		if (employeeInfoBean != null) {
			// Valid credentials
			HttpSession session = req.getSession(true);
			session.setAttribute("employeeInfoBean", employeeInfoBean);
			session.setMaxInactiveInterval(60); // gets Logout after 60 sec.

			req.getRequestDispatcher("./homePageJsp.jsp").forward(req, resp);

		} else {
			// Invalid credentials
			req.setAttribute("msg", "Invalid Credentials!..");
			req.getRequestDispatcher("./loginForm").forward(req, resp);
		}

	}// end of doPost()

}// end of class
