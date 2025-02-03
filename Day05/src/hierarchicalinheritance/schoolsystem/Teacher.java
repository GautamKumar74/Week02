package hierarchicalinheritance.schoolsystem;

class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole() {
        System.out.println("Role: Teacher");
    }

    public void displayTeacherDetails() {
        displayBasicDetails();
        System.out.println("Subject: " + subject);
    }
}

