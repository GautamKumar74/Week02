package assistedproblems.employeemanagementsystem;

class Employee{
    String name;
    int id;
    int salary;
    Employee(String name, int id, int salary){
        this.name= name;
        this.id= id;
        this.salary= salary;
    }
    void displayDetails(){
        System.out.println("Employee Details: ");
        System.out.println("name: " + this.name);
        System.out.println("id: " + this.id);
        System.out.println("salary: " + this.salary);
    }
}
