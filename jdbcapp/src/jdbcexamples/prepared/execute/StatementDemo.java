package jdbcexamples.prepared.execute;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementDemo {

	public static void main(String[] args) {

		String selectQuery = "select * from employees where id = ?";
		String udpateQuery = "update employees set name = ? where id =? ";

		// Step1: Register the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root",
				"password"); 
				Statement statement = connection.createStatement();) {

			int rowsUpdated = statement.executeUpdate(udpateQuery);

			if (rowsUpdated > 0) {
				System.out.println("Successfully Updated record");

			} else {
				System.out.println("Unable to update the record");
			}

			ResultSet rs = statement.executeQuery(selectQuery);
			while (rs.next()) {
				System.out.println("ID: " + rs.getInt("id"));
				System.out.println("Name: " + rs.getString("name"));
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
