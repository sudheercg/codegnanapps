package txn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class WithoutTransactionExample {

    private static final String SQL_INSERT = "INSERT INTO EMPLOYEES (id, name) VALUES (?, ?)";
    private static final String SQL_UPDATE = "UPDATE EMPLOYEES SET name = ? WHERE id = ?";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "password");
             PreparedStatement psInsert = conn.prepareStatement(SQL_INSERT);
             PreparedStatement psUpdate = conn.prepareStatement(SQL_UPDATE)) {

            // Insert first employee
            psInsert.setInt(1, 14);
            psInsert.setString(2, "sudheer14");
            psInsert.executeUpdate();

            // Insert second employee
            psInsert.setInt(1, 15);
            psInsert.setString(3, "prajeeth15");
            psInsert.executeUpdate();

            // Introduce an error in the update statement by setting an invalid parameter index
            psUpdate.setString(1, "updated");
            psUpdate.setInt(2, 14); // This will cause an error (parameter index 3 does not exist)
            psUpdate.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
