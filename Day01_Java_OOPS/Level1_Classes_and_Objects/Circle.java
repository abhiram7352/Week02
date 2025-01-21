
import java.util.Scanner;
//creating a employee class
class Circle{
	//Attributes
	int radius;
	
	
	//Creating parametrized Constructor 
	Circle(int radius){
		this.radius = radius;
		
	}
	
	public static double areaOfCircle(int radius){
		return radius*radius*3.14;
	}
	//Creating a displayResults method to display the results
	public void displayResults(){
		
		double area = areaOfCircle(radius);
	    System.out.println( "Area of the circle : " + area);
	}

    public static void main(String []args){
		
		//Creating scanner class to read input from the user
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter radius: ");
		int radius = sc.nextInt();
		
		//Creating object
		Circle circle1 = new Circle(radius);

		
		//calling displayResults method using employee1 reference variable
		circle1.displayResults();
	}
}