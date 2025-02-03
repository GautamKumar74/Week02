package employeemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Creating a list of employees
        List<Employee> employees = new ArrayList<>();

        // Adding full-time employee
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("E101", "Alice", 50000);
        fullTimeEmployee.assignDepartment("IT");
        employees.add(fullTimeEmployee);

        // Adding part-time employee
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("E102", "Bob", 0, 20, 500);
        partTimeEmployee.assignDepartment("HR");
        employees.add(partTimeEmployee);

        // Processing and displaying employee details using polymorphism
        for (Employee emp : employees) {
            emp.displayDetails();
            if (emp instanceof Department) {
                System.out.println(((Department) emp).getDepartmentDetails());
            }
            System.out.println("---------------------------");
        }
    }
}