
import java.util.Scanner;
//creating a Book class
class Item{
	//Attributes
	String itemCode;
	String itemName;
	int quantity;
	int price;
	
	//Creating parametrized Constructor 
	Item(String itemCode, String itemName, int quantity, int price){
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
	}
	public static int computeTotalCost(  int quantity, int price){
		return quantity*price;
	}
	
	//Creating a displayItemDetails method to display the results
	public void displayItemDetails(){
		
		//calling computeTotalCost method and storing the result in totalCost variable
		int totalCost = computeTotalCost(quantity, price);
	    System.out.println("Item details: ");
		System.out.println("Name of the item is "+ itemName + ", code of the item is "+ itemCode + " price of the item is " + price);
		System.out.println("Total cost to buy " + quantity + " item is " + totalCost);
	}

    public static void main(String []args){
		
		//Creating scanner class to read input from the user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter itemCode: ");
		String itemCode = sc.nextLine();
		
		System.out.print("Enter itemName: ");
		String itemName = sc.nextLine();
		
		System.out.print("Enter quantity: ");
		int quantity = sc.nextInt();
		
		System.out.print("Enter price: ");
		int price = sc.nextInt();
		
		//Creating object
		Item item1 = new Item(itemCode, itemName, quantity, price);
		System.out.println("Details of the Item are: ");
		
		//calling displayItemDetails method using item1 reference variable
		item1.displayItemDetails();
	}
}