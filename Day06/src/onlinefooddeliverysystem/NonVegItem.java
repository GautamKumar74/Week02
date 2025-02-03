package onlinefooddeliverysystem;

class NonVegItem extends FoodItem implements Discountable {
    private double discount;
    private final double additionalCharge = 2.5; // Fixed additional charge per item

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discount = 0; // Default discount
    }

    @Override
    public double calculateTotalPrice() {
        double basePrice = (getPrice() + additionalCharge) * getQuantity();
        return basePrice - (basePrice * (discount / 100));
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        this.discount = discountPercentage;
    }

    @Override
    public String getDiscountDetails() {
        return "Discount Applied: " + discount + "%";
    }
}
