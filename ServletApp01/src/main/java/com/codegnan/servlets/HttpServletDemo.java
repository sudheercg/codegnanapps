package com.codegnan.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpServletDemo extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// Get the ServletConfig
		ServletConfig config = getServletConfig();

		String servletName = config.getServletName();

		out.println("Servlet Nme: " + servletName);

		String username = config.getInitParameter("username");
		out.println("Username: " + username);

		String password = config.getInitParameter("password");
		out.println("Password: " + password);

		// Get the ServletContext
		ServletContext context = getServletContext();
		String dbURL = context.getInitParameter("dbURL");
		out.println(dbURL);

		String dbUser = context.getInitParameter("dbUser");
		out.println(dbUser);
		String dbPassword = context.getInitParameter("dbPassword");
		out.println(dbPassword);

	}

}
