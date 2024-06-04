package txn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class WithTransactionExample {

    private static final String SQL_INSERT = "INSERT INTO EMPLOYEES (id, name) VALUES (?, ?)";
    private static final String SQL_UPDATE = "UPDATE EMPLOYEES SET name = ? WHERE id = ?";

    public static void main(String[] args) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "password");
            conn.setAutoCommit(false); // Disable auto-commit mode
            
            // Prepare insert statement
            PreparedStatement psInsert = conn.prepareStatement(SQL_INSERT);
            // Prepare update statement
            PreparedStatement psUpdate = conn.prepareStatement(SQL_UPDATE);

            // Insert first employee
            
            psInsert.setInt(1, 15);
            psInsert.setString(2, "p16");
            psInsert.executeUpdate();
           
            // Insert second employee
            psInsert.setInt(1, 14);
            psInsert.setString(3, "p17");
            psInsert.executeUpdate();


            // Introduce an error in the update statement by setting an invalid parameter index
            psUpdate.setString(1, "updated sud");
            psUpdate.setInt(2, 15); // This will cause an error (parameter index 3 does not exist)
            psUpdate.executeUpdate();

            // If no exceptions occurred, commit the transaction
            conn.commit();

        } catch (SQLException e) {
            // Rollback the transaction if any SQL exception occurred
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            e.printStackTrace();
        } finally {
            // Close resources in finally block
            if (conn != null) {
                try {
                    conn.setAutoCommit(true); // Restore auto-commit mode
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
