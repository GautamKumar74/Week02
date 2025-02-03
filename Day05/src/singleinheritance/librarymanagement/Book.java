package singleinheritance.librarymanagement;

class Book {
    protected String title;
    protected int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void displayInfo() {
        System.out.println("Book Info: Title = " + title + ", Publication Year = " + publicationYear);
    }
}
