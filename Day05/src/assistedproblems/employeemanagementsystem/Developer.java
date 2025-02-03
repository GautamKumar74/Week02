package assistedproblems.employeemanagementsystem;

class Developer extends Employee{
    private String programmingLanguage;
    Developer(String name, int id, int salary, String programmingLanguage){
        super(name,id,salary);
        this.name= name;
        this.id= id;
        this.salary= salary;
        this.programmingLanguage= programmingLanguage;
    }
    void displayDetails(){
        System.out.println("Developer Details: ");
        System.out.println("name: " + this.name);
        System.out.println("id: " + this.id);
        System.out.println("salary: " + this.salary);
        System.out.println("programmingLanguage: " + this.programmingLanguage);
    }
}

