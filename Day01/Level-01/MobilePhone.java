public class MobilePhone {
    // Attributes of the MobilePhone class
    private String brand;
    private String model;
    private double price;

    // Constructor to initialize MobilePhone objects
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display mobile phone details
    public void displayDetails() {
        System.out.println("Mobile Phone Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }

    // Main method to test the MobilePhone class
    public static void main(String[] args) {
        // Creating a MobilePhone object
        MobilePhone phone = new MobilePhone("Samsung", "Galaxy S21", 799.99);

        // Displaying the phone details
        phone.displayDetails();
    }
}
