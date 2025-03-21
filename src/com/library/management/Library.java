package com.library.management;
import java.util.ArrayList;
import java.util.List;

// Class managing the library's inventory and patrons
public class Library {
    private List<Book> books;
    private List<Patron> patrons;

    // Constructor initializes empty lists
    public Library() {
        books = new ArrayList<>();
        patrons = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added book: " + book.getTitle());
    }

    // Method to remove a book
    public void removeBook(Book book) {
        if (books.remove(book)) {
            System.out.println("Removed book: " + book.getTitle());
        } else {
            System.out.println("Book not found.");
        }
    }

    // Method to add a patron to the library
    public void addPatron(Patron patron) {
        patrons.add(patron);
        System.out.println("Added patron: " + patron.getName());
    }

    // Search for books by title, author, or ISBN
    public void searchBook(String keyword) {
        for (Book book : books) {
            if (book.getTitle().contains(keyword) || book.getAuthor().contains(keyword) || book.getISBN().equals(keyword)) {
                book.displayBookInfo();
            }
        }
    }
}
