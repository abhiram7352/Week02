
import java.util.Scanner;
//creating a Book class
class MobilePhone{
	//Attributes
	String brand;
	String model;
	int price;
	
	//Creating parametrized Constructor 
	MobilePhone( String brand, String model, int price){
		this.brand = brand;
		this.model = model;
		this.price = price;
		
	}
	
	//Creating a displayPhoneDetails method to display the results
	public void displayPhoneDetails(){
		
	    System.out.println("Phone details: ");
		System.out.println("Brand of the Phone is "+ brand + ", Model of the Phone is "+ model + " and price of the phone  is " + price);
	}

    public static void main(String []args){
		
		//Creating scanner class to read input from the user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter brand: ");
		String brand = sc.nextLine();
		
		System.out.print("Enter model: ");
		String model = sc.nextLine();

		
		System.out.print("Enter price: ");
		int price = sc.nextInt();
		
		//Creating object
		MobilePhone mobile1 = new MobilePhone( brand, model, price);
		System.out.println("Details of the phone are: ");
		
		//calling displayPhoneDetails method using item1 reference variable
		mobile1.displayPhoneDetails();
	}
}