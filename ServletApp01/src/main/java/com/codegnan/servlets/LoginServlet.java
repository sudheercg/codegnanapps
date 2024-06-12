package com.codegnan.servlets;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve username and password from the request
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Perform authentication (this is a simple example, in real applications, use proper authentication mechanisms)
        if ("admin".equals(username) && "password".equals(password)) {
            // Create a new session
            HttpSession session = request.getSession(true);
            
            // Store user information in the session
            session.setAttribute("username", username);
            session.setAttribute("isLoggedIn", true);
            
            // Redirect to a welcome page
            response.sendRedirect("Welcome");
        } else {
            // Authentication failed, redirect back to login page
            response.sendRedirect("login.html?error=1");
        }
    }
}
