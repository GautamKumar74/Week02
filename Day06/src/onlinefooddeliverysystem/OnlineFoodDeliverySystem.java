package onlinefooddeliverysystem;

import java.util.ArrayList;
import java.util.List;

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        // List to store food items
        List<FoodItem> order = new ArrayList<>();

        // Adding items to the order
        VegItem vegBurger = new VegItem("Veg Burger", 5.0, 2);
        vegBurger.applyDiscount(10); // 10% discount on Veg Burger

        NonVegItem chickenBurger = new NonVegItem("Chicken Burger", 7.0, 3);
        chickenBurger.applyDiscount(15); // 15% discount on Chicken Burger

        order.add(vegBurger);
        order.add(chickenBurger);

        // Process the order
        double totalOrderPrice = 0;

        for (FoodItem item : order) {
            item.getItemDetails();
            if (item instanceof Discountable) {
                Discountable discountableItem = (Discountable) item;
                System.out.println(discountableItem.getDiscountDetails());
            }
            double totalPrice = item.calculateTotalPrice();
            System.out.println("Total Price: $" + totalPrice);
            totalOrderPrice += totalPrice;
            System.out.println("-------------------------");
        }

        System.out.println("Total Order Price: $" + totalOrderPrice);
    }
}
