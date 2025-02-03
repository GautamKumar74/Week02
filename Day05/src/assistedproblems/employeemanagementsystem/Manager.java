package assistedproblems.employeemanagementsystem;

class Manager extends Employee{
    private int teamSize;
    Manager(String name, int id, int salary, int teamSize){
        super(name,id,salary);
        this.name= name;
        this.id= id;
        this.salary= salary;
        this.teamSize= teamSize;
    }
    void displayDetails(){
        System.out.println("Manager Details: ");
        System.out.println("name: " + this.name);
        System.out.println("id: " + this.id);
        System.out.println("salary: " + this.salary);
        System.out.println("teamSize: " + this.teamSize);
    }
}
