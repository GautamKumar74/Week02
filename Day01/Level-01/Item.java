public class Item {
    // Attributes of the Item class
    private String itemCode;
    private String itemName;
    private double price;

    // Constructor to initialize Item objects
    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    public void displayDetails() {
        System.out.println("Item Details:");
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: $" + price);
    }

    // Method to calculate the total cost for a given quantity
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    // Main method to test the Item class
    public static void main(String[] args) {
        // Creating an Item object
        Item item = new Item("A101", "Laptop", 750.00);

        // Displaying the item details
        item.displayDetails();

        // Calculating and displaying the total cost for a given quantity
        int quantity = 3;
        double totalCost = item.calculateTotalCost(quantity);
        System.out.println("Total Cost for " + quantity + " items: $" + totalCost);
    }
}
