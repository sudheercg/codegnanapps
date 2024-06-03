package jdbcexamples.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementDemo {

	public static void main(String[] args) throws SQLException {

		String selectQuery = "select * from employees where id = ?";
		// PreparedStatement

		// Step1: Register the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try(
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "password");
		PreparedStatement pst = connection.prepareStatement(selectQuery);
				){
		pst.setInt(1, 7);
		// pst.setString(2, "sud");

		ResultSet rs = pst.executeQuery();

		while (rs.next()) {

			System.out.println("ID: " + rs.getInt("id"));
			System.out.println("Name: " + rs.getString("name"));

		}

	}catch(SQLException e) {
		e.printStackTrace();
	}

}
}
