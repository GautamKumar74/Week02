package singleinheritance.librarymanagement;

public class LibraryManagement {
    public static void main(String[] args) {
        // Create an Author object
        Author author = new Author("To Kill a Mockingbird", 1960, "Harper Lee", "Harper Lee was an American novelist, best known for her 1960 Pulitzer Prize-winning novel.");

        // Call displayInfo() to show details of the book and its author
        author.displayInfo();
    }
}
