package hybridinheritance.restaurantmanagementsystem;

public class RestaurantManagement {
    public static void main(String[] args) {
        // Create objects for Chef and Waiter
        Chef chef = new Chef("Gordon Ramsay", 101, "French Cuisine");
        Waiter waiter = new Waiter("John Smith", 201, 5);

        // Display Chef details and perform duties
        System.out.println("Chef Details:");
        chef.displayChefDetails();
        chef.performDuties();
        System.out.println();

        // Display Waiter details and perform duties
        System.out.println("Waiter Details:");
        waiter.displayWaiterDetails();
        waiter.performDuties();
    }
}