import java.util.Scanner;
//creating student class
class Student {
    String name;
    int rollNumber;
    double marks;

    // Constructor
    Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
	//Method to calculate the grade
	public static String studentGrade(double marks){
		if(marks > 90 && marks < 100){
			return "A+";
		}else if(marks > 80 && marks < 90){
			return "A";
		}else if(marks > 70 && marks < 80){
			return "B+";
		}else if(marks > 60 && marks < 70){
			return "B";
		}else if(marks > 50 && marks < 60){
			return "C+";
		}else if(marks > 40 && marks < 50){
			return "C";
		}else {
			return "Fail";
		}
		//return "You need to work hard";
	}

    // Method to display student details
    void displayDetails() {
		String grade = studentGrade(marks);
        System.out.println("Name: " + name + ", Roll Number: " + rollNumber + ", Marks: " + marks);
		System.out.println("Grade of the student("+ name+") is "+ grade);
    }



    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter your Roll Number: ");
		int rollNumber = sc.nextInt();
		
		System.out.println("Enter your Marks: ");
		double marks = sc.nextDouble();
		
		//Creating object of the Student class
        Student student = new Student(name, rollNumber, marks);
		
		//calling displayDetails using student reference variable
        student.displayDetails(); 
    }
}
