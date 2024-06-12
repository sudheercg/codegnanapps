package com.codegnan.springbootapp.libraryapp;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    
    @Autowired
    private BorrowRecordRepository borrowRecordRepository;
    
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
    
    public Book getBookById(Long id) {
        return bookRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Book not found"));
    }
    
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }
    
    public Book updateBook(Long id, Book bookDetails) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Book not found"));
        book.setTitle(bookDetails.getTitle());
        book.setAuthor(bookDetails.getAuthor());
        book.setGenre(bookDetails.getGenre());
        book.setAvailable(bookDetails.isAvailable());
        return bookRepository.save(book);
    }
    
    public void deleteBook(Long id) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Book not found"));
        bookRepository.delete(book);
    }
    
    public BorrowRecord borrowBook(Long bookId, Long memberId) {
        Book book = getBookById(bookId);
        if (!book.isAvailable()) {
            throw new IllegalStateException("Book is not available");
        }
        
        book.setAvailable(false);
        bookRepository.save(book);
        
        BorrowRecord record = new BorrowRecord();
        record.setBook(book);
       // record.setMember(new Member(memberId));  // Simplified for brevity
        record.setBorrowDate(LocalDate.now());
        return borrowRecordRepository.save(record);
    }
    
    public void returnBook(Long bookId, Long memberId) {
        List<BorrowRecord> records = borrowRecordRepository.findByBookIdAndReturnDateIsNull(bookId);
        for (BorrowRecord record : records) {
            if (record.getMember().getId().equals(memberId)) {
                record.setReturnDate(LocalDate.now());
                borrowRecordRepository.save(record);
                
                Book book = record.getBook();
                book.setAvailable(true);
                bookRepository.save(book);
                return;
            }
        }
        throw new IllegalStateException("No matching borrow record found");
    }
    
    public List<BorrowRecord> getBorrowedBooks(Long memberId) {
        return borrowRecordRepository.findByMemberId(memberId);
    }
}
