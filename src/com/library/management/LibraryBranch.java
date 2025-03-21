package com.library.management;

import java.util.ArrayList;
import java.util.List;

// Represents a library branch
public class LibraryBranch {
    private String branchName;
    private List<Book> books; // Books in this branch

    // Constructor
    public LibraryBranch(String branchName) {
        this.branchName = branchName;
        this.books = new ArrayList<>();
    }

    // Getters
    public String getBranchName() { return branchName; }
    public List<Book> getBooks() { return books; }

    // Add a book to this branch
    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " added to " + branchName);
    }

    // Remove a book from this branch
    public boolean removeBook(Book book) {
        if (books.contains(book)) {
            books.remove(book);
            System.out.println(book.getTitle() + " removed from " + branchName);
            return true;
        }
        return false;
    }

    // Transfer a book to another branch
    public void transferBook(Book book, LibraryBranch targetBranch) {
        if (removeBook(book)) {
            targetBranch.addBook(book);
            System.out.println(book.getTitle() + " transferred to " + targetBranch.getBranchName());
        } else {
            System.out.println("Book not found in " + branchName);
        }
    }

    // Display books in this branch
    public void displayBooks() {
        System.out.println("Books in " + branchName + ":");
        for (Book book : books) {
            book.displayBookInfo();
        }
    }
}
