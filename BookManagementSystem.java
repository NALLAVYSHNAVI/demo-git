package Task;
import java.util.Scanner;
public class BookManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nBook Management System Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Books");
            System.out.println("4. Display Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int bookID = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();

                    Book newBook = new Book(bookID, title, author);
                    library.addBook(newBook);
                    break;

                case 2:
                    System.out.print("Enter Book ID to remove: ");
                    int removeBookID = scanner.nextInt();
                    library.removeBook(removeBookID);
                    break;

                case 3:
                	System.out.print("Enter Book ID to search: ");
                    int searchBookID = scanner.nextInt();
                    library.searchBook(searchBookID);
                    break;
                case 4:
                    library.displayBooks();
                    break;

                case 5:
                    System.out.println("Exiting the Book Management System. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
