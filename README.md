+------------------------+
|        Book           |
+------------------------+
| - title: String       |
| - author: String      |
| - ISBN: String        |
| - publicationYear: int|
| - isAvailable: boolean|
+------------------------+
| + getTitle(): String  |
| + getAuthor(): String |
| + getISBN(): String   |
| + getPublicationYear(): int |
| + isAvailable(): boolean   |
| + setAvailable(boolean) |
| + displayBookInfo()   |
+------------------------+

             |
             |  1
             |  
             ▼
+------------------------+
|       Library         |
+------------------------+
| - books: List<Book>   |
| - patrons: List<Patron> |
+------------------------+
| + addBook(Book)       |
| + removeBook(Book)    |
| + addPatron(Patron)   |
| + searchBook(String)  |
+------------------------+

             |
             | 1
             |  
             ▼
+------------------------+
|     LibraryBranch     |
+------------------------+
| - branchName: String  |
| - books: List<Book>   |
+------------------------+
| + getBranchName(): String |
| + addBook(Book)       |
| + removeBook(Book): boolean |
| + transferBook(Book, LibraryBranch) |
| + displayBooks()      |
+------------------------+

             |
             | 1
             |  
             ▼
+------------------------+
|        Patron         |
+------------------------+
| - name: String        |
| - patronID: String    |
| - borrowedBooks: List<Book> |
+------------------------+
| + getName(): String   |
| + getPatronID(): String |
| + borrowBook(Book)    |
| + returnBook(Book)    |
+------------------------+

             |
             | 1
             |
             ▼
+-------------------------------+
|    LibraryManagementSystem    |
+-------------------------------+
| + main(String[] args)         |
+-------------------------------+

Relationships:
Library contains a list of Books and a list of Patrons.

LibraryBranch manages its own Book collection.

Patron borrows and returns Books.

LibraryManagementSystem acts as the entry point for the system.
