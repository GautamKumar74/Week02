package librarymanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // List to store library items
        List<LibraryItem> items = new ArrayList<>();

        // Adding items to the list
        items.add(new Book("B101", "The Great Gatsby", "F. Scott Fitzgerald"));
        items.add(new Magazine("M202", "National Geographic", "Various"));
        items.add(new DVD("D303", "Inception", "Christopher Nolan"));

        // Process each item
        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable reservableItem = (Reservable) item;
                System.out.println("Availability: " + (reservableItem.checkAvailability() ? "Available" : "Not Available"));
                reservableItem.reserveItem("John Doe");
                System.out.println("Availability after reservation: " + (reservableItem.checkAvailability() ? "Available" : "Not Available"));
            }

            System.out.println("---------------------------");
        }
    }
}
