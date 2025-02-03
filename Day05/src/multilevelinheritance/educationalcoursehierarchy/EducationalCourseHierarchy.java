package multilevelinheritance.educationalcoursehierarchy;

public class EducationalCourseHierarchy {
    public static void main(String[] args) {
        // Create objects for each level of course
        Course basicCourse = new Course("Intro to Programming", 8);
        OnlineCourse onlineCourse = new OnlineCourse("Data Structures", 12, "Coursera", true);
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Advanced Java", 16, "Udemy", true, 200, 20);

        // Display course details for each level
        System.out.println("Basic Course Details:");
        basicCourse.displayCourseDetails();
        System.out.println();

        System.out.println("Online Course Details:");
        onlineCourse.displayCourseDetails();
        System.out.println();

        System.out.println("Paid Online Course Details:");
        paidCourse.displayCourseDetails();
    }
}
