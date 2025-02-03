package hierarchicalinheritance.schoolsystem;

public class SchoolSystem {
    public static void main(String[] args) {
        // Create objects for each role
        Teacher teacher = new Teacher("Alice", 35, "Mathematics");
        Student student = new Student("Bob", 16, "10th Grade");
        Staff staff = new Staff("Charlie", 40, "Administration");

        // Display details for each role
        System.out.println("Teacher Details:");
        teacher.displayRole();
        teacher.displayTeacherDetails();
        System.out.println();

        System.out.println("Student Details:");
        student.displayRole();
        student.displayStudentDetails();
        System.out.println();

        System.out.println("Staff Details:");
        staff.displayRole();
        staff.displayStaffDetails();
    }
}
