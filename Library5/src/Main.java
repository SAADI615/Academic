public class Main {
    public static void main(String[] args) {
        LibraryManagementSystem lms = new LibraryManagementSystem();

        // Add new books
        lms.addBook(new Book(1010, "Learn Java", "Salim Sadman"));
        lms.addBook(new Book(1011, "Learn Advanced Java", "Dhroubo"));

        // Display all books
        System.out.println("Library Books:");
        lms.viewBooks();

        // Update the title of "Learn Advanced Java"
        lms.updateBook(1011, "Learn Java: Advanced Topics", "Nipa");

        // Search for a book by title
        System.out.println("\nSearching for 'Learn Java':");
        Book foundBook = lms.searchBookByTitle("Learn Java");
        System.out.println(foundBook != null ? foundBook : "Book not found.");

        // Delete the "Learn Java" book
        lms.deleteBook(1010);
        System.out.println("\nAfter deleting 'Learn Java':");
        lms.viewBooks();
    }
}