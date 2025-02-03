import java.util.ArrayList;

// Product Class
class Product {
    private String name;
    private double price;

    // Constructor to initialize product details
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Get the name of the product
    public String getName() {
        return name;
    }

    // Get the price of the product
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}

// Order Class
class Order {
    private int orderId;
    private ArrayList<Product> products; // Aggregation relationship with Product

    // Constructor to initialize order with an ID
    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    // Add a product to the order
    public void addProduct(Product product) {
        products.add(product);
    }

    // Display the details of the order
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Products in the Order:");
        for (Product product : products) {
            System.out.println("- " + product);
        }
    }
}

// Customer Class
class Customer {
    private String name;
    private ArrayList<Order> orders; // Association relationship with Order

    // Constructor to initialize customer
    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    // Place an order for the customer
    public void placeOrder(Order order) {
        orders.add(order);
    }

    // Display all orders placed by the customer
    public void displayCustomerOrders() {
        System.out.println("Customer: " + name);
        System.out.println("Orders:");
        for (Order order : orders) {
            order.displayOrderDetails();
        }
    }

    // Get the customer's name
    public String getName() {
        return name;
    }
}

// ECommercePlatform Class
public class ECommercePlatform {
    private ArrayList<Customer> customers; // List of customers
    private ArrayList<Product> products;   // List of products

    // Constructor to initialize platform
    public ECommercePlatform() {
        customers = new ArrayList<>();
        products = new ArrayList<>();
    }

    // Add a customer to the platform
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    // Add a product to the platform
    public void addProduct(Product product) {
        products.add(product);
    }

    // Display all products available on the platform
    public void displayProducts() {
        System.out.println("Available Products:");
        for (Product product : products) {
            System.out.println("- " + product);
        }
    }

    // Display all customers and their orders
    public void displayCustomerDetails() {
        System.out.println("Customers and their Orders:");
        for (Customer customer : customers) {
            customer.displayCustomerOrders();
            System.out.println();
        }
    }

    // Main Method to simulate the platform
    public static void main(String[] args) {
        // Create an e-commerce platform
        ECommercePlatform platform = new ECommercePlatform();

        // Add products to the platform
        Product product1 = new Product("Laptop", 1200.00);
        Product product2 = new Product("Phone", 800.00);
        Product product3 = new Product("Headphones", 150.00);
        platform.addProduct(product1);
        platform.addProduct(product2);
        platform.addProduct(product3);

        // Display available products
        platform.displayProducts();

        // Create customers
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        // Add customers to the platform
        platform.addCustomer(customer1);
        platform.addCustomer(customer2);

        // Customer 1 places an order
        Order order1 = new Order(101);
        order1.addProduct(product1);
        order1.addProduct(product3);
        customer1.placeOrder(order1);

        // Customer 2 places an order
        Order order2 = new Order(102);
        order2.addProduct(product2);
        customer2.placeOrder(order2);

        // Display customer details and orders
        platform.displayCustomerDetails();
    }
}
