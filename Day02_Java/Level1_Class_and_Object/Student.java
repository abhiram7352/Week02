package Day02_Java.Level1_Class_and_Object;

public class Student {
    // Public instance variable
    public int rollNumber;

    // Protected instance variable
    protected String name;

    // Private instance variable
    private double CGPA;

    // Constructor to initialize student details
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to access CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to modify CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// Subclass to demonstrate the use of protected members
class PostgraduateStudent extends Student {
    private String thesisTitle;

    // Constructor to initialize postgraduate student details
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String thesisTitle) {
        super(rollNumber, name, CGPA);
        this.thesisTitle = thesisTitle;
    }

    // Method to display postgraduate student details
    public void displayPostgraduateStudentDetails() {
        displayStudentDetails();
        System.out.println("Thesis Title: " + thesisTitle);
    }

    public static void main(String[] args) {
        Student student = new Student(1, "Abhiram", 3.8);
        student.displayStudentDetails();

        // Modify CGPA
        student.setCGPA(3.9);
        System.out.println("Updated CGPA: " + student.getCGPA());

        PostgraduateStudent pgStudent = new PostgraduateStudent(2, "Ramesh kr", 3.9, "AI Research");
        pgStudent.displayPostgraduateStudentDetails();
    }
}
