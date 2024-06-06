package libraryapp;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class LibraryManagementSystem {
    private static BookDAO bookDAO = new BookDAO();
    private static BorrowDAO borrowDAO = new BorrowDAO();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Library Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Update Book");
            System.out.println("3. Delete Book");
            System.out.println("4. View Books");
            System.out.println("5. Borrow Book");
            System.out.println("6. Return Book");
            System.out.println("7. View Borrowed Books");
            System.out.println("8. Exit");

            System.out.println("Please enter your choice (1 - 8): ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            try {
                switch (choice) {
                    case 1:
                        addBook(scanner);
                        break;
                    case 2:
                        updateBook(scanner);
                        break;
                    case 3:
                        deleteBook(scanner);
                        break;
                    case 4:
                        viewBooks();
                        break;
                    case 5:
                        borrowBook(scanner);
                        break;
                    case 6:
                        returnBook(scanner);
                        break;
                    case 7:
                        viewBorrowedBooks(scanner);
                        break;
                    case 8:
                        System.out.println("Exiting...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice, please try again.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private static void addBook(Scanner scanner) throws SQLException {
        System.out.println("Enter book title:");
        String title = scanner.nextLine();
        System.out.println("Enter book author:");
        String author = scanner.nextLine();
        System.out.println("Enter book publisher:");
        String publisher = scanner.nextLine();
        System.out.println("Enter book year:");
        int year = scanner.nextInt();

        Book book = new Book(title, author, publisher, year);
        bookDAO.addBook(book);
        System.out.println("Book added successfully.");
    }

    private static void updateBook(Scanner scanner) throws SQLException {
        System.out.println("Enter book id to update:");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.println("Enter new book title:");
        String title = scanner.nextLine();
        System.out.println("Enter new book author:");
        String author = scanner.nextLine();
        System.out.println("Enter new book publisher:");
        String publisher = scanner.nextLine();
        System.out.println("Enter new book year:");
        int year = scanner.nextInt();

        Book book = new Book(id, title, author, publisher, year);
        bookDAO.updateBook(book);
        System.out.println("Book updated successfully.");
    }

    private static void deleteBook(Scanner scanner) throws SQLException {
        System.out.println("Enter book id to delete:");
        int id = scanner.nextInt();
        bookDAO.deleteBook(id);
        System.out.println("Book deleted successfully.");
    }

    private static void viewBooks() throws SQLException {
        List<Book> books = bookDAO.getAllBooks();
        for (Book book : books) {
            System.out.println(book);
        }
    }

    private static void borrowBook(Scanner scanner) throws SQLException {
        System.out.println("Enter member id:");
        int memberId = scanner.nextInt();
        System.out.println("Enter book id:");
        int bookId = scanner.nextInt();
        Date borrowDate = new Date(System.currentTimeMillis());

        borrowDAO.borrowBook(bookId, memberId, borrowDate);
        System.out.println("Book borrowed successfully.");
    }

    private static void returnBook(Scanner scanner) throws SQLException {
        System.out.println("Enter borrow id:");
        int borrowId = scanner.nextInt();
        Date returnDate = new Date(System.currentTimeMillis());

        borrowDAO.returnBook(borrowId, returnDate);
        System.out.println("Book returned successfully.");
    }

    private static void viewBorrowedBooks(Scanner scanner) throws SQLException {
        System.out.println("Enter member id:");
        int memberId = scanner.nextInt();

        List<BorrowedBook> borrowedBooks = borrowDAO.getBorrowedBooks(memberId);
        for (BorrowedBook borrowedBook : borrowedBooks) {
            System.out.println(borrowedBook);
        }
    }
}
