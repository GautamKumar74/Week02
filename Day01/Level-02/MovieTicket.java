public class MovieTicket {
    // Attributes of the MovieTicket class
    private String movieName;
    private String seatNumber;
    private double price;

    // Constructor to initialize MovieTicket objects
    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = "Not Assigned";
        this.price = 0.0;
    }

    // Method to book a ticket (assign seat and update price)
    public void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        System.out.println("Movie Ticket Details:");
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: $" + price);
    }

    // Main method to test the MovieTicket class
    public static void main(String[] args) {
        // Creating a MovieTicket object
        MovieTicket ticket = new MovieTicket("Inception");

        // Booking the ticket
        ticket.bookTicket("A10", 12.50);

        // Displaying the ticket details
        ticket.displayTicketDetails();
    }
}
