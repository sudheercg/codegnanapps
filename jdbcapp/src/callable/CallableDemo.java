package callable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallableDemo {
	
	static final String DB_URL = "jdbc:mysql://localhost:3306/employee";
	static final String DB_USER = "root";
	static final String DB_PASSWORD="password";
	

	public static void main(String[] args) {

	
	 Connection connection = null;
	 CallableStatement callableStatement;
	 
	 try {
		String sqlProcedure = "{CALL insertEmployee(?,?)}";
		connection  = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
		
		callableStatement = connection.prepareCall(sqlProcedure);
		
		callableStatement.setInt(1, 101);
		callableStatement.setString(2,"Srinath");
	
		callableStatement.execute();
		System.out.println("Employee inserted Successfully");
		
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	}	
	
	
	}

}
