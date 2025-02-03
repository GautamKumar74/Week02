package librarymanagementsystem;

class Book extends LibraryItem implements Reservable {
    private boolean isAvailable;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isAvailable = true;
    }

    @Override
    public int getLoanDuration() {
        return 14; // Loan duration for books: 14 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(borrowerName + " has reserved the book: " + getTitle());
        } else {
            System.out.println("Book: " + getTitle() + " is currently unavailable.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

