package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        // Create a configuration instance
    	
    	//If cfg.xml in another package
    	//Configuration configuration = new Configuration().configure("com/codegnan/resources/hibernate.cfg.xml");

    	//if in default package
    	Configuration configuration = new Configuration().configure();

        // Build a SessionFactory from the configuration
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        // Obtain a session
        Session session = sessionFactory.openSession();

        // Start a transaction
        session.beginTransaction();

        // Create an employee entity
        Employee employee = new Employee("John Doe");

        // Save the employee entity
        session.save(employee);

        // Commit the transaction
        session.getTransaction().commit();

        // Retrieve the employee entity
        Employee retrievedEmployee = session.get(Employee.class, employee.getId());
        System.out.println("Retrieved Employee: " + retrievedEmployee.getName());

        // Close the session
        session.close();

        // Close the SessionFactory
        sessionFactory.close();
    }
}
