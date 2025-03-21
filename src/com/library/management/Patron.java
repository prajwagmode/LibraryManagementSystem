package com.library.management;
import java.util.ArrayList;
import java.util.List;

// Class representing a library patron
public class Patron {
    private String name;
    private String patronID;
    private List<Book> borrowedBooks; // List of borrowed books

    // Constructor to initialize patron details
    public Patron(String name, String patronID) {
        this.name = name;
        this.patronID = patronID;
        this.borrowedBooks = new ArrayList<>();
    }

    // Getters and setters
    public String getName() { return name; }
    public String getPatronID() { return patronID; }
    public List<Book> getBorrowedBooks() { return borrowedBooks; }

    // Method to borrow a book
    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            borrowedBooks.add(book);
            book.setAvailable(false); // Mark book as borrowed
            System.out.println(name + " borrowed " + book.getTitle());
        } else {
            System.out.println("Book is not available for borrowing.");
        }
    }

    // Method to return a book
    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.setAvailable(true); // Mark book as available
            System.out.println(name + " returned " + book.getTitle());
        } else {
            System.out.println("This book was not borrowed by " + name);
        }
    }
}
