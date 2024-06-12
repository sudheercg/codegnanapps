package com.codegnan.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//Generic Servlet

public class DemoServlet extends GenericServlet {
	
	public void service(ServletRequest req, ServletResponse res) throws IOException {
		
		res.setContentType("text/html");
		
		//Get PrintWriter object
		PrintWriter writer = res.getWriter();
		
		writer.println("Hello from GenericServlet");
		
		//Generic Servlet methods
		String servletName= getServletName();
		writer.println("Servlet Name: "+servletName);
		
		String servletInfo = getServletInfo();
		writer.println(servletInfo);
		
		//Get remote address of client
		String clientIP = req.getRemoteAddr();
		writer.println(clientIP);
		
		//Retrieve the Form parameters from the request
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		
		System.out.println();
		
		writer.println("Name: "+name);
		writer.println("Email: "+email);
		
		// Get the ServletConfig
		ServletConfig config = getServletConfig();

		//String servletName = config.getServletName();

	//	out.println("Servlet Nme: " + servletName);

		String username = config.getInitParameter("username");
		writer.println("Username: " + username);

		String password = config.getInitParameter("password");
		writer.println("Password: " + password);

		// Get the ServletContext
		ServletContext context = getServletContext();
		String dbURL = context.getInitParameter("dbURL");
		writer.println(dbURL);

		String dbUser = context.getInitParameter("dbUser");
		writer.println(dbUser);
		String dbPassword = context.getInitParameter("dbPassword");
		writer.println(dbPassword);
		
		
		
		
		writer.flush();
		
		
		
		
		
		
		
		
		
	}

}
