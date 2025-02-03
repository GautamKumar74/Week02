package onlinefooddeliverysystem;

class VegItem extends FoodItem implements Discountable {
    private double discount;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discount = 0; // Default discount
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) - ((getPrice() * getQuantity()) * (discount / 100));
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