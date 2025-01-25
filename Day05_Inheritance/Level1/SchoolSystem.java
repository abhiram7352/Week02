package Day05_Inheritance.Level1;

// Superclass for Person
class PPerson {
    String name;
    int age;

    // Constructor to initialize name and age
    PPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass for Teacher
class Teacher extends PPerson {
    String subject;

    // Constructor to initialize name, age, and subject
    Teacher(String name, int age, String subject) {
        super(name, age);  // Call to superclass constructor
        this.subject = subject;
    }

    // Method to display the role of the person
    void displayRole() {
        System.out.println("Role: Teacher");
    }

    // Overridden method to display teacher details
    @Override
    void displayDetails() {
        // Call to superclass method to display common details
        super.displayDetails();
        System.out.println("Subject: " + subject);
    }
}

// Subclass for Student
class Student extends PPerson {
    // Attribute for the grade of the student
    String grade;

    // Constructor to initialize name, age, and grade
    Student(String name, int age, String grade) {
        super(name, age);  // Call to superclass constructor
        this.grade = grade;
    }

    // Method to display the role of the person
    void displayRole() {
        System.out.println("Role: Student");
    }

    // Overridden method to display student details
    @Override
    void displayDetails() {
        super.displayDetails();  // Call to superclass method to display common details
        System.out.println("Grade: " + grade);
    }
}

// Subclass for Staff
class Staff extends PPerson {
    // Attribute for the department of the staff
    String department;

    // Constructor to initialize name, age, and department
    Staff(String name, int age, String department) {
        super(name, age);  // Call to superclass constructor
        this.department = department;
    }

    // Method to display the role of the person
    void displayRole() {
        System.out.println("Role: Staff");
    }

    // Overridden method to display staff details
    @Override
    void displayDetails() {
        super.displayDetails();  // Call to superclass method to display common details
        System.out.println("Department: " + department);
    }
}

// Main class to demonstrate the hierarchy
public class SchoolSystem {
    public static void main(String[] args) {
        // Creating an instance of Teacher
        Teacher teacher = new Teacher("Virendra", 40, "Mathematics");
        System.out.println("Teacher Details:");
        teacher.displayDetails();
        teacher.displayRole();

        System.out.println();

        // Creating an instance of Student
        Student student = new Student("Abhiram kumar", 16, "11th Grade");
        System.out.println("Student Details:");
        student.displayDetails();
        student.displayRole();

        System.out.println();

        // Creating an instance of Staff
        Staff staff = new Staff("Rahul", 50, "Maintenance");
        System.out.println("Staff Details:");
        staff.displayDetails();
        staff.displayRole();
    }
}
