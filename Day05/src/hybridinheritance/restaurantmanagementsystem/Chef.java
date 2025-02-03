package hybridinheritance.restaurantmanagementsystem;

class Chef extends Person implements Worker {
    private String specialty;

    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println("Duties: Prepares meals, manages kitchen staff, and ensures food quality.");
    }

    public void displayChefDetails() {
        displayBasicDetails();
        System.out.println("Specialty: " + specialty);
    }
}
