public class Book {
    // Attributes of the Book class
    private String title;
    private String author;
    private double price;

    // Constructor to initialize Book objects
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    // Main method to test the Book class
    public static void main(String[] args) {
        // Creating a Book object
        Book book = new Book("To Kill a Mockingbird", "Harper Lee", 18.99);

        // Displaying the book details
        book.displayDetails();
    }
}
