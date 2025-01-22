class Employee {
    // Static variable shared by all employees
    static String companyName = "Tech Solutions Inc.";

    // Static variable to track the total number of employees
    private static int totalEmployees = 0;

    // Static method to display the total number of employees
    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Instance variables
    private String name;
    private final int id; // Final variable to ensure the ID cannot be changed
    private String designation;

    // Constructor using 'this' to initialize instance variables
    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++; // Increment the total number of employees
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        if (this instanceof Employee) { // Using 'instanceof' to check the object type
            System.out.println("Name: " + this.name);
            System.out.println("ID: " + this.id);
            System.out.println("Designation: " + this.designation);
            System.out.println("Company: " + companyName);
        } else {
            System.out.println("The object is not an instance of Employee.");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Display the company name
        System.out.println("Company Name: " + Employee.companyName);

        // Creating employee objects
        Employee emp1 = new Employee("Alice Johnson", 101, "Software Engineer");
        Employee emp2 = new Employee("Bob Smith", 102, "Project Manager");

        // Displaying employee details
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();

        // Displaying the total number of employees
        Employee.displayTotalEmployees();
    }
}
