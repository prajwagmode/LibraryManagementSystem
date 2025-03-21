package com.library.management;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create two library branches
        LibraryBranch branch1 = new LibraryBranch("Kudlu Library");
        LibraryBranch branch2 = new LibraryBranch("Ecity Library");

        // Create books
        Book book1 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", "112233445", 1997);
        Book book2 = new Book("A Guide to Indian Stock Market", "Jitendra Gala", "112244668", 2016);

        // Add books to branch1
        branch1.addBook(book1);
        branch1.addBook(book2);

        // Display books in branch1
        branch1.displayBooks();

        // Transfer a book from branch1 to branch2
        branch1.transferBook(book1, branch2);

        // Display books in both branches
        branch1.displayBooks();
        branch2.displayBooks();
    }
}
