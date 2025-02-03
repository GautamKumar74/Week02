public class Student {
    // Attributes of the Student class
    private String name;
    private int rollNumber;
    private double marks;

    // Constructor to initialize Student objects
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate the grade based on the marks
    public String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method to display student details and grade
    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    // Main method to test the Student class
    public static void main(String[] args) {
        // Creating a Student object
        Student student = new Student("Alice Johnson", 101, 85.5);

        // Displaying the student's details and grade
        student.displayDetails();
    }
}
