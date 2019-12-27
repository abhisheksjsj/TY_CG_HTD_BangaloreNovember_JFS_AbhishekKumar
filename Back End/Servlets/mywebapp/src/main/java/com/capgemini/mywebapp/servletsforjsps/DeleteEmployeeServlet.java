package com.capgemini.mywebapp.servletsforjsps;

import java.io.IOException;
import java.security.Provider.Service;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.mywebapp.beans.EmployeeInfoBean;
import com.capgemini.mywebapp.service.EmployeeService;
import com.capgemini.mywebapp.service.EmployeeServiceImpl;

@WebServlet("/deleteEmployee2")
public class DeleteEmployeeServlet extends HttpServlet {

	private EmployeeService service = new EmployeeServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);

		if (session != null) {
			// valid Session
			int empId = Integer.parseInt(req.getParameter("empId"));
			boolean isDeleted = service.deleteEmployee(empId);
			if (isDeleted) {
				req.setAttribute("msg", "Record for Employee Id" + empId + "Deleted");
			} else {
				req.setAttribute("msg", "Employee Id" + empId + "Not Found");
			}
			req.getRequestDispatcher("./deleteEmpJsp.jsp").forward(req, resp);

		} else {
			// Invalid Session
			req.setAttribute("msg", "Please Login First !..");
			req.getRequestDispatcher("./loginForm").forward(req, resp);
		}

	}// end of doGet()

}// end of class
