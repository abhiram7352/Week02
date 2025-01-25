package Day05_Inheritance.Level1;

// Base class for Course
class Course {
    String courseName;  // Attribute for the name of the course
    int duration;  // Attribute for the duration of the course in hours

    // Constructor to initialize courseName and duration
    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Method to display course details
    void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}

// Subclass of Course for Online Courses
class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    // Constructor to initialize courseName, duration, platform, and isRecorded
    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);  // Call to superclass constructor
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Overridden method to display online course details
    @Override
    void displayCourseDetails() {
        super.displayCourseDetails();  // Call to superclass method to display common details
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// Subclass of OnlineCourse for Paid Online Courses
class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    // Constructor to initialize courseName, duration, platform, isRecorded, fee, and discount
    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);  // Call to superclass constructor
        this.fee = fee;
        this.discount = discount;
    }

    // Overridden method to display paid online course details
    @Override
    void displayCourseDetails() {
        super.displayCourseDetails();  // Call to superclass method to display common details
        System.out.println("Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
        double discountedFee = fee - (fee * discount / 100);
        System.out.println("Discounted Fee: $" + discountedFee);
    }
}

// Main class to demonstrate the hierarchy
public class EducationalCourseSystem {
    public static void main(String[] args) {
        // Creating an instance of Course
        Course course = new Course("Introduction to Java", 40);
        System.out.println("Course Details:");
        course.displayCourseDetails();

        System.out.println();

        // Creating an instance of OnlineCourse
        OnlineCourse onlineCourse = new OnlineCourse("Advanced Python", 60, "Coursera", true);
        System.out.println("Online Course Details:");
        onlineCourse.displayCourseDetails();

        System.out.println();

        // Creating an instance of PaidOnlineCourse
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Data Science Bootcamp", 120, "Udemy", false, 300, 20);
        System.out.println("Paid Online Course Details:");
        paidOnlineCourse.displayCourseDetails();
    }
}
