package com.capgemini.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.internal.util.ConfigHelper;

public class DateServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// Current System Date & Time
		Date date = new Date();// java.util.Date,need to create an Object of Date class

		// get the Context Param
		//ServletContext context = getServletContext();
		ServletContext context = req.getServletContext();
		String contextParamVal = context.getInitParameter("myContextParam");
		
		//get config param
		ServletConfig config = getServletConfig();
		String configParamVal= config.getInitParameter("myConfigParam");
				

		resp.setContentType("text/html"); // type of the content present in the response
		resp.setHeader("refresh", "1");// after how many seconds the page will get refreshed automatically

		PrintWriter out = resp.getWriter();// getWriter use the Object of PrintWriter
		out.print("<html>");// print or println is used to display the content on the Browser
		out.print("<h2>Current System Date & Time - <br>" + date + "</h2>");
		out.println("<br><br>Context Param Value = " + contextParamVal);
		out.println("<br><br>Config Param Value = " + configParamVal);
		out.print("</html>");

	}// end of doGet

}// end of class
