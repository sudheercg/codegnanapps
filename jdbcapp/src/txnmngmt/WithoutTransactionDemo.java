package txnmngmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class WithoutTransactionDemo {
	
	static final String DB_URL = "jdbc:mysql://localhost:3306/employee";
	static final String DB_USER = "root";
	static final String DB_PASSWORD="password";

	static final String SQL_INSERT = "INSERT INTO EMPLOYEES(id,name) values (?,?)";
	static final String SQL_UPDATE = "update employees set name=? where id =?";

	public static void main(String[] args) {
		
		try {
			Connection conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
			
			PreparedStatement pInsert = conn.prepareStatement(SQL_INSERT);
			PreparedStatement pUpdate = conn.prepareStatement(SQL_UPDATE);
			
			//Insert first employee
			pInsert.setInt(1,1);
			pInsert.setString(2,"Ram");
			pInsert.executeUpdate();
			
			
			//Insert second employee
			pInsert.setInt(3,2);
			pInsert.setString(2,"Ritesh");
			pInsert.executeUpdate();
			
			
			//Update the employee table
			pUpdate.setString(1, "Ram Kumar");
			pUpdate.setInt(2, 1);
			pUpdate.executeUpdate();
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
