package assistedproblems.employeemanagementsystem;

class Intern extends Employee{
    private String domain;
    Intern(String name, int id, int salary, String domain){
        super(name,id,salary);
        this.name= name;
        this.id= id;
        this.salary= salary;
        this.domain= domain;
    }
    void displayDetails(){
        System.out.println("Intern Details: ");
        System.out.println("name: " + this.name);
        System.out.println("id: " + this.id);
        System.out.println("salary: " + this.salary);
        System.out.println("domain: " + this.domain);
    }
}
