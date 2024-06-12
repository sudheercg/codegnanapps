package com.codegnan.servlets;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Welcome")
public class WelcomeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get the current session, but do not create a new one if it doesn't exist
        HttpSession session = request.getSession(false);

        // Check if the user is logged in
        if (session != null && Boolean.TRUE.equals(session.getAttribute("isLoggedIn"))) {
            // Retrieve user information from the session
            String username = (String) session.getAttribute("username");

            // Display a personalized welcome message
            response.getWriter().println("Welcome, " + username + "!");
        } else {
            // User is not logged in, redirect to the login page
            response.sendRedirect("login.html");
        }
    }
}
