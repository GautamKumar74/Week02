package ecommerceplatform;

import java.util.ArrayList;
import java.util.List;

public class ECommercePlatform {
    public static void main(String[] args) {
        // Create a list of products
        List<Product> products = new ArrayList<>();

        // Add products to the list
        products.add(new Electronics("E101", "Laptop", 60000));
        products.add(new Clothing("C202", "T-Shirt", 1000));
        products.add(new Groceries("G303", "Rice", 500));

        // Calculate and display final prices using polymorphism
        for (Product product : products) {
            product.displayDetails();
            double finalPrice = product.getPrice() + (product instanceof Taxable ? ((Taxable) product).calculateTax() : 0)
                    - product.calculateDiscount();

            if (product instanceof Taxable) {
                System.out.println(((Taxable) product).getTaxDetails());
            }

            System.out.println("Final Price: " + finalPrice);
            System.out.println("---------------------------");
        }
    }
}
