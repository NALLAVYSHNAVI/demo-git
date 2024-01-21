package Task;
import java.util.Scanner;
public class Library {
    private Book[] books;

    public Library() {
        this.books = new Book[5];
    }
    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                System.out.println("Book added successfully.");
                return;
            }
        }
        System.out.println("Library is full. Cannot add more books.");
    }

    // Method to remove a book in the library
    public void removeBook(int bookID) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getBookID() == bookID) {
                System.out.println("Book removed successfully:");
                System.out.println(books[i]);
                books[i] = null;
                return;
            }
        }
        System.out.println("Book not found in the library.");
    }
    // Method to search a book in the library
    public void searchBook(int bookID) {
        for (Book book : books) {
            if (book != null && book.getBookID() == bookID) {
                System.out.println("Book found:");
                System.out.println("Book ID: " + book.getBookID() +
                        ", Title: " + book.getTitle() +
                        ", Author: " + book.getAuthor());
                return;
            }
        }
        System.out.println("Book not found in the library.");
    }
    // Method to display all books in the library
    public void displayBooks() {
        System.out.println("Books in the library:");
        for (Book book : books) {
            if (book != null && book.isAvailable()) {
                System.out.println("Book ID: " + book.getBookID() +
                        ", Title: " + book.getTitle() +
                        ", Author: " + book.getAuthor());
            }
        }
    }
}