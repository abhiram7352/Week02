package Day02_Java.Level1_Class_and_Object;

public class Course {
    // Class variable to keep track of the institute name
    private static String instituteName = "Default Institute";

    // Instance variables
    private String courseName;
    private int duration;
    private double fee;

    // Constructor to initialize course details
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee + " USD");
    }

    // Class method to update the institute name for all courses
    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    // Main method for testing
    public static void main(String[] args) {
        Course course1 = new Course("Data Science", 6, 1000);
        Course course2 = new Course("Machine Learning", 4, 800);

        course1.displayCourseDetails();
        course2.displayCourseDetails();

        // Update the institute name
        Course.updateInstituteName("New Institute Name");

        course1.displayCourseDetails();
        course2.displayCourseDetails();
    }
}
