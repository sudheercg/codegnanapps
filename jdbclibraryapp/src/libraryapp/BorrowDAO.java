package libraryapp;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BorrowDAO {

    public void borrowBook(int bookId, int memberId, Date borrowDate) throws SQLException {
        String query = "INSERT INTO BorrowedBooks (book_id, member_id, borrow_date) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, bookId);
            stmt.setInt(2, memberId);
            stmt.setDate(3, borrowDate);
            stmt.executeUpdate();
        }
    }

    public void returnBook(int borrowId, Date returnDate) throws SQLException {
        String query = "UPDATE BorrowedBooks SET return_date = ? WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setDate(1, returnDate);
            stmt.setInt(2, borrowId);
            stmt.executeUpdate();
        }
    }

    public List<BorrowedBook> getBorrowedBooks(int memberId) throws SQLException {
        List<BorrowedBook> borrowedBooks = new ArrayList<>();
        String query = "SELECT * FROM BorrowedBooks WHERE member_id = ? AND return_date IS NULL";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, memberId);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    BorrowedBook borrowedBook = new BorrowedBook(
                        rs.getInt("id"),
                        rs.getInt("book_id"),
                        rs.getInt("member_id"),
                        rs.getDate("borrow_date"),
                        rs.getDate("return_date")
                    );
                    borrowedBooks.add(borrowedBook);
                }
            }
        }
        return borrowedBooks;
    }
}
