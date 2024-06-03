package jdbcexamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo4 {

	public static void main(String[] args) {

		String query = "select * from employees";
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
			ResultSet resultSet = statement.executeQuery(query);

			// processing the resultset
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				System.out.println("ID: " + id + ", " + "Name: " + name);
			}

		} catch (SQLException sqlexp) {
			sqlexp.printStackTrace();
		}

	}

}
