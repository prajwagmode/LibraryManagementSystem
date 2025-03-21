package com.library.management;

// Class representing a book in the library
public class Book {
    private String title;
    private String author;
    private String ISBN;
    private int publicationYear;
    private boolean isAvailable;

    // Constructor to initialisze a book
    public Book(String title, String author, String ISBN, int publicationYear) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publicationYear = publicationYear;
        this.isAvailable = true; // Book is available by default
    }

    // Getters and setters for book attributes
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getISBN() { return ISBN; }
    public int getPublicationYear() { return publicationYear; }
    public boolean isAvailable() { return isAvailable; }

    public void setAvailable(boolean available) { this.isAvailable = available; }

    // Method to display book details
    public void displayBookInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + ISBN +
                           ", Year: " + publicationYear + ", Available: " + isAvailable);
    }
}
