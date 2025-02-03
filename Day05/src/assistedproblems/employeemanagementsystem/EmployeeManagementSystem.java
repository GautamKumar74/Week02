package assistedproblems.employeemanagementsystem;

public class EmployeeManagementSystem {
    public static void main(String[] args){
        Employee e= new Employee("Harshit", 1, 200000);
        Manager m= new Manager("Neeraj", 2, 210000,5);
        Developer d= new Developer("Harsh", 3, 220000,"java");
        Intern i= new Intern("Naveen", 4, 20000,"Python");
        e.displayDetails();
        m.displayDetails();
        d.displayDetails();
        i.displayDetails();
    }
}
