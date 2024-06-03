package jdbcexamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo2 {

	public static void main(String[] args) {

		String insertQuery = "Insert into employees(id,name) values(1,'Jagan')";
		// Step 1: Registering the Driver

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try (// Step 2: Establish connection with database
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root",
						"password");
				// Step 3: Creating the Statement
				Statement statement = connection.createStatement())

		{
     		statement.executeUpdate(insertQuery);
			System.out.println("Record Inserted Successfully");

		} catch (SQLException sqlexp) {
			sqlexp.printStackTrace();
		}

	}

}
