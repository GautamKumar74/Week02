class Product {
    // Static variable shared by all products
    static double discount = 10.0; // Discount percentage

    // Static method to update the discount percentage
    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to: " + discount + "%");
    }

    // Instance variables
    private String productName;
    private double price;
    private int quantity;
    private final int productID; // Final variable to ensure productID is immutable

    // Constructor using 'this' to initialize instance variables
    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to display product details
    public void displayProductDetails() {
        if (this instanceof Product) { // Using 'instanceof' to check the object type
            System.out.println("Product ID: " + this.productID);
            System.out.println("Product Name: " + this.productName);
            System.out.println("Price: $" + this.price);
            System.out.println("Quantity: " + this.quantity);
            System.out.println("Discount: " + discount + "%");
        } else {
            System.out.println("The object is not an instance of Product.");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Updating and displaying the discount
        Product.updateDiscount(15.0);

        // Creating product objects
        Product product1 = new Product(101, "Laptop", 999.99, 2);
        Product product2 = new Product(102, "Smartphone", 499.99, 5);

        // Displaying product details
        product1.displayProductDetails();
        product2.displayProductDetails();
    }
}
