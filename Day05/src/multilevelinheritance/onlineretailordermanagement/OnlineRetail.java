package multilevelinheritance.onlineretailordermanagement;

public class OnlineRetail {
    public static void main(String[] args) {
        // Create objects for each type of order
        Order order = new Order("O12345", "2025-01-20");
        ShippedOrder shippedOrder = new ShippedOrder("O12346", "2025-01-18", "TRK56789");
        DeliveredOrder deliveredOrder = new DeliveredOrder("O12347", "2025-01-15", "TRK12345", "2025-01-22");

        // Display order details and status for each type of order
        System.out.println("Order Details:");
        order.displayOrderDetails();
        System.out.println("Status: " + order.getOrderStatus());
        System.out.println();

        System.out.println("Shipped Order Details:");
        shippedOrder.displayOrderDetails();
        System.out.println("Status: " + shippedOrder.getOrderStatus());
        System.out.println();

        System.out.println("Delivered Order Details:");
        deliveredOrder.displayOrderDetails();
        System.out.println("Status: " + deliveredOrder.getOrderStatus());
    }
}
