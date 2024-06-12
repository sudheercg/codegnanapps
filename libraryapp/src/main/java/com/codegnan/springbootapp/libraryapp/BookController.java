package com.codegnan.springbootapp.libraryapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//http://localhost:8080/api/books
@RequestMapping("/api/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        Book book = bookService.getBookById(id);
        return ResponseEntity.ok(book);
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book bookDetails) {
        Book updatedBook = bookService.updateBook(id, bookDetails);
        return ResponseEntity.ok(updatedBook);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
        return ResponseEntity.noContent().build();
    }
    
    @PostMapping("/{id}/borrow")
    public ResponseEntity<BorrowRecord> borrowBook(@PathVariable Long id, @RequestBody Long memberId) {
        BorrowRecord record = bookService.borrowBook(id, memberId);
        return ResponseEntity.ok(record);
    }

    @PostMapping("/{id}/return")
    public ResponseEntity<Void> returnBook(@PathVariable Long id, @RequestBody Long memberId) {
        bookService.returnBook(id, memberId);
        return ResponseEntity.noContent().build();
    }
    
    @GetMapping("/borrowed/{memberId}")
    public ResponseEntity<List<BorrowRecord>> getBorrowedBooks(@PathVariable Long memberId) {
        List<BorrowRecord> records = bookService.getBorrowedBooks(memberId);
        return ResponseEntity.ok(records);
    }
    
}
