package Day03_Keyword_Practice_Problem.Level1;


public class Student {
    // Static attributes
    static String universityName = "Rajiv Gandhi Proudyogiki Vishwavidyalaya";
    static int totalStudents = 0;

    // Instance attributes
    String name;
    final int rollNumber;
    char grade;

    // Constructor
    public Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    // Static method to display the total number of students
    static void displayTotalStudents() {
        System.out.println("Total number of students: " + totalStudents);
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("University Name: " + universityName);
        System.out.println("Student Name: " + name);
        System.out.println("Student Roll Number: " + rollNumber);
        System.out.println("Student Grade: " + grade);
    }

    // Main method
    public static void main(String[] args) {
        // Creating student objects
        Student student1 = new Student("Rahul Kumar", 11121130, 'A');
        Student student2 = new Student("Abhiram Kumar", 11121131, 'B');

        // Displaying details of each student
        student1.displayDetails();
        System.out.println();
        student2.displayDetails();
        System.out.println();

        // Displaying the total number of students
        Student.displayTotalStudents();
    }
}
