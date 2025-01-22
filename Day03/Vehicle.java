class Vehicle {
    // Static variable shared across all vehicles
    static double registrationFee = 100.0;

    // Static method to update the registration fee
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: $" + registrationFee);
    }

    // Instance variables
    private String ownerName;
    private String vehicleType;
    private final String registrationNumber; // Final variable to ensure registrationNumber is immutable

    // Constructor using 'this' to initialize instance variables
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Method to display vehicle registration details
    public void displayRegistrationDetails() {
        if (this instanceof Vehicle) { // Using 'instanceof' to check the object type
            System.out.println("Owner Name: " + this.ownerName);
            System.out.println("Vehicle Type: " + this.vehicleType);
            System.out.println("Registration Number: " + this.registrationNumber);
            System.out.println("Registration Fee: $" + registrationFee);
        } else {
            System.out.println("The object is not an instance of Vehicle.");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Updating and displaying the registration fee
        Vehicle.updateRegistrationFee(120.0);

        // Creating vehicle objects
        Vehicle vehicle1 = new Vehicle("Alice Johnson", "Car", "ABC123");
        Vehicle vehicle2 = new Vehicle("Bob Smith", "Motorcycle", "XYZ789");

        // Displaying vehicle registration details
        vehicle1.displayRegistrationDetails();
        vehicle2.displayRegistrationDetails();
    }
}
