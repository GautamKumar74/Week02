import java.util.ArrayList;

public class CartItem {
    // Attributes of the CartItem class
    private String itemName;
    private double price;
    private int quantity;

    // Constructor to initialize CartItem objects
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate the total cost of the item
    public double getTotalCost() {
        return price * quantity;
    }

    // Method to display item details
    public void displayItemDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: $" + getTotalCost());
    }

    // Main class to simulate the shopping cart
    public static class ShoppingCart {
        private ArrayList<CartItem> cart;

        // Constructor to initialize an empty shopping cart
        public ShoppingCart() {
            cart = new ArrayList<>();
        }

        // Method to add an item to the cart
        public void addItem(CartItem item) {
            cart.add(item);
            System.out.println("Item added: " + item.itemName);
        }

        // Method to remove an item from the cart
        public void removeItem(String itemName) {
            for (CartItem item : cart) {
                if (item.itemName.equals(itemName)) {
                    cart.remove(item);
                    System.out.println("Item removed: " + itemName);
                    return;
                }
            }
            System.out.println("Item not found in the cart.");
        }

        // Method to display the total cost of all items in the cart
        public void displayTotalCost() {
            double totalCost = 0.0;
            for (CartItem item : cart) {
                totalCost += item.getTotalCost();
            }
            System.out.println("Total Cart Cost: $" + totalCost);
        }

        // Method to display all items in the cart
        public void displayCartItems() {
            if (cart.isEmpty()) {
                System.out.println("The cart is empty.");
                return;
            }
            System.out.println("Shopping Cart Items:");
            for (CartItem item : cart) {
                item.displayItemDetails();
            }
        }
    }

    // Main method to test the shopping cart functionality
    public static void main(String[] args) {
        // Creating ShoppingCart object
        ShoppingCart cart = new ShoppingCart();

        // Adding items to the cart
        CartItem item1 = new CartItem("Laptop", 799.99, 1);
        CartItem item2 = new CartItem("Phone", 499.99, 2);
        cart.addItem(item1);
        cart.addItem(item2);

        // Displaying cart items and total cost
        cart.displayCartItems();
        cart.displayTotalCost();

        // Removing an item from the cart
        cart.removeItem("Phone");

        // Displaying updated cart items and total cost
        cart.displayCartItems();
        cart.displayTotalCost();
    }
}
