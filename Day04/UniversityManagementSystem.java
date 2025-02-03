import java.util.ArrayList;

// Course Class
class Course {
    private String courseName;
    private Professor professor; // Aggregation with Professor
    private ArrayList<Student> students; // Aggregation with Students

    // Constructor
    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    // Get the course name
    public String getCourseName() {
        return courseName;
    }

    // Assign a professor to the course
    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    // Enroll a student in the course
    public void enrollStudent(Student student) {
        students.add(student);
    }

    // Display course details
    public void displayCourseDetails() {
        System.out.println("Course: " + courseName);
        if (professor != null) {
            System.out.println("Taught by: " + professor.getName());
        } else {
            System.out.println("No professor assigned.");
        }
        System.out.println("Enrolled Students:");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }
}

// Professor Class
class Professor {
    private String name;
    private ArrayList<Course> courses; // Aggregation with Course

    // Constructor
    public Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Get professor's name
    public String getName() {
        return name;
    }

    // Assign a course to the professor
    public void assignCourse(Course course) {
        courses.add(course);
        course.assignProfessor(this); // Set this professor for the course
    }

    // Display courses taught by the professor
    public void displayCourses() {
        System.out.println("Professor: " + name);
        System.out.println("Courses Taught:");
        for (Course course : courses) {
            System.out.println("- " + course.getCourseName());
        }
    }
}

// Student Class
class Student {
    private String name;
    private ArrayList<Course> courses; // Association with Course

    // Constructor
    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Get student's name
    public String getName() {
        return name;
    }

    // Enroll the student in a course
    public void enrollCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this); // Add this student to the course's student list
    }

    // Display courses the student is enrolled in
    public void displayCourses() {
        System.out.println("Student: " + name);
        System.out.println("Enrolled Courses:");
        for (Course course : courses) {
            System.out.println("- " + course.getCourseName());
        }
    }
}

// University Management System Class
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create some courses
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Algorithms");
        Course course3 = new Course("Operating Systems");

        // Create some professors
        Professor professor1 = new Professor("Dr. Smith");
        Professor professor2 = new Professor("Dr. Johnson");

        // Assign professors to courses
        professor1.assignCourse(course1);
        professor1.assignCourse(course2);
        professor2.assignCourse(course3);

        // Create some students
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        Student student3 = new Student("Charlie");

        // Enroll students in courses
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course2);
        student2.enrollCourse(course3);
        student3.enrollCourse(course3);

        // Display details
        System.out.println("Course Details:");
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
        System.out.println();
        course3.displayCourseDetails();
        System.out.println();

        System.out.println("Professor Details:");
        professor1.displayCourses();
        System.out.println();
        professor2.displayCourses();
        System.out.println();

        System.out.println("Student Details:");
        student1.displayCourses();
        System.out.println();
        student2.displayCourses();
        System.out.println();
        student3.displayCourses();
    }
}
