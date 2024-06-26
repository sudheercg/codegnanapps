package com.codegnan.springbootapp.libraryapp;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;



@Entity
@Data

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String title;
    private String author;
    private String genre;
    private boolean isAvailable;
    
    // Getters and setters
    @OneToMany(mappedBy = "book")
    private List<BorrowRecord> borrowRecords;
    
}
