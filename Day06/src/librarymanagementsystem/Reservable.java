package librarymanagementsystem;

interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}
