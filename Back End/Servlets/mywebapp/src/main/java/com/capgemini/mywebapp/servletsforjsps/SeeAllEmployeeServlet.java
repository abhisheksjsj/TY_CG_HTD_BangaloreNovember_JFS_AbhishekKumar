package com.capgemini.mywebapp.servletsforjsps;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.mywebapp.beans.EmployeeInfoBean;
import com.capgemini.mywebapp.service.EmployeeService;
import com.capgemini.mywebapp.service.EmployeeServiceImpl;

@WebServlet("/seeAllEmployees")
public class SeeAllEmployeeServlet extends HttpServlet {

	EmployeeService service = new EmployeeServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if (session != null) {
			// Valid Session
			List<EmployeeInfoBean> employeeList = service.getAllEmployees();
			if (employeeList != null && !employeeList.isEmpty()) {
				req.setAttribute("employeeList", employeeList);

			} else {
				req.setAttribute("msg", "No Employee Record to Display!..");
				
			}
			req.getRequestDispatcher("./seeAllEmployeesJsp.jsp").forward(req, resp);

		} else {
			// Invalid Session
			req.setAttribute("msg", "Please Login First!....");
			req.getRequestDispatcher("./loginForm").forward(req, resp);

		} // end of Session Validation

	}// end of doGet()

}// end of class
