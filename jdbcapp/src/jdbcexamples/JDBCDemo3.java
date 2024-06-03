package jdbcexamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo3 {

	public static void main(String[] args) {

		String updateQuery = "Update employees set name='Sam' where id =1";
		String insertQuery = "Insert into employees(id,name) values(7,'Stud')";

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
     		int rowsUpdated= statement.executeUpdate(updateQuery);
     		int rowsUpdated2= statement.executeUpdate(insertQuery);

     		
     		if(rowsUpdated >0) {
     			System.out.println("Record Updated Successfully");
     		}else {
     			System.out.println("Record not found with the specified Id");
     		}
			

		} catch (SQLException sqlexp) {
			sqlexp.printStackTrace();
		}

	}

}
