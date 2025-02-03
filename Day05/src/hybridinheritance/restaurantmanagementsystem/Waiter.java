package hybridinheritance.restaurantmanagementsystem;

class Waiter extends Person implements Worker {
    private int tableCount;

    public Waiter(String name, int id, int tableCount) {
        super(name, id);
        this.tableCount = tableCount;
    }

    @Override
    public void performDuties() {
        System.out.println("Duties: Takes orders, serves food, and assists customers.");
    }

    public void displayWaiterDetails() {
        displayBasicDetails();
        System.out.println("Tables Assigned: " + tableCount);
    }
}
