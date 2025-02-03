public class Employee {
    // Attributes of the Employee class
    private String name;
    private int id;
    private double salary;

    // Constructor to initialize Employee objects
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }

    // Main method to test the Employee class
    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp = new Employee("John Doe", 101, 50000.00);

        // Displaying the employee details
        emp.displayDetails();
    }
}
