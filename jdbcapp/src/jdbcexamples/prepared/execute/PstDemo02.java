package jdbcexamples.prepared.execute;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PstDemo02 {

	public static void main(String[] args) throws SQLException {

		String udpateQuery = "update employees set name = ? where id =? ";
		// PreparedStatement

		// Step1: Register the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root",
				"password"); PreparedStatement pst = connection.prepareStatement(udpateQuery);) {
			pst.setString(1, "Salman");
			// pst.setString(2, "sud");

			boolean isResultSet = pst.execute();

			if (!isResultSet) {
				System.out.println("Record Updated");
			} else {
				System.out.println("Couldnt update the record");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
