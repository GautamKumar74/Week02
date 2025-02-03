package hybridinheritance.restaurantmanagementsystem;

class Person {
    protected String name;
    protected int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayBasicDetails() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}