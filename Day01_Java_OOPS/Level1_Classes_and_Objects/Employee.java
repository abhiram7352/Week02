
import java.util.Scanner;
//creating a employee class
class Employee{
	//Attributes
	String name;
	String id;
	int salary;
	
	//Creating parametrized Constructor 
	Employee(String name, String id, int salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	//Creating a displayDetails method to display the results
	public void displayDetails(){
	    System.out.println("Name: " + name + " his employent id: " + id + " and his salary is: "+ salary);
	}

    public static void main(String []args){
		
		//Creating scanner class to read input from the user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter ID: ");
		String id = sc.nextLine();
		
		System.out.print("Enter salary: ");
		int salary = sc.nextInt();
		
		//Creating object
		Employee employee1 = new Employee(name, id, salary);
		System.out.println("Employee details are: ");
		
		//calling displayDetails method using employee1 reference variable
		employee1.displayDetails();
	}
}