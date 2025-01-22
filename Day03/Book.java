class Book {
    // Static variable shared across all instances
    static String libraryName = "City Library";

    // Static method to display the library name
    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Instance variables
    private String title;
    private String author;
    private final String isbn; // Final variable to ensure ISBN is immutable

    // Constructor using 'this' to initialize instance variables
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Method to display book details
    public void displayBookDetails() {
        if (this instanceof Book) { // Using 'instanceof' to check the object type
            System.out.println("Title: " + this.title);
            System.out.println("Author: " + this.author);
            System.out.println("ISBN: " + this.isbn);
        } else {
            System.out.println("The object is not an instance of Book.");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Displaying the library name
        Book.displayLibraryName();

        // Creating book objects
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "1234567890");
        Book book2 = new Book("1984", "George Orwell", "9876543210");

        // Displaying book details
        book1.displayBookDetails();
        book2.displayBookDetails();
    }
}
