package librarymanagementsystem;

class DVD extends LibraryItem implements Reservable {
    private boolean isAvailable;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isAvailable = true;
    }

    @Override
    public int getLoanDuration() {
        return 5; // Loan duration for DVDs: 5 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(borrowerName + " has reserved the DVD: " + getTitle());
        } else {
            System.out.println("DVD: " + getTitle() + " is currently unavailable.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}
