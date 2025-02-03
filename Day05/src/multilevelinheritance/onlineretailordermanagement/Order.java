package multilevelinheritance.onlineretailordermanagement;

class Order {
    protected String orderId;
    protected String orderDate;

    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order placed.";
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId + ", Order Date: " + orderDate);
    }
}
