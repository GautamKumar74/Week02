class Student {
    // Static variable shared across all students
    static String universityName = "Global University";

    // Static variable to track the total number of students
    private static int totalStudents = 0;

    // Static method to display the total number of students
    static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    // Instance variables
    private String name;
    private final int rollNumber; // Final variable to ensure rollNumber is immutable
    private String grade;

    // Constructor using 'this' to initialize instance variables
    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++; // Increment the total number of students
    }

    // Method to display student details
    public void displayStudentDetails() {
        if (this instanceof Student) { // Using 'instanceof' to check the object type
            System.out.println("Name: " + this.name);
            System.out.println("Roll Number: " + this.rollNumber);
            System.out.println("Grade: " + this.grade);
            System.out.println("University: " + universityName);
        } else {
            System.out.println("The object is not an instance of Student.");
        }
    }

    // Method to update grade
    public void updateGrade(String newGrade) {
        if (this instanceof Student) { // Using 'instanceof' to check the object type
            this.grade = newGrade;
            System.out.println("Grade updated for Roll Number: " + this.rollNumber);
        } else {
            System.out.println("The object is not an instance of Student.");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Display the university name
        System.out.println("University Name: " + Student.universityName);

        // Creating student objects
        Student student1 = new Student("John Doe", 101, "A");
        Student student2 = new Student("Jane Smith", 102, "B");

        // Displaying student details
        student1.displayStudentDetails();
        student2.displayStudentDetails();

        // Updating and displaying new grades
        student1.updateGrade("A+");
        student1.displayStudentDetails();

        // Displaying the total number of students
        Student.displayTotalStudents();
    }
}
