
import java.util.Scanner;
//creating a employee class
class Book{
	//Attributes
	String title;
	String author;
	int price;
	
	//Creating parametrized Constructor 
	Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	//Creating a displayDetails method to display the results
	public void displayDetails(){
	    System.out.println("Title of the book is " + title + " author of the book(" +title+ ") is " + author + " and its price is "+ price);
	}

    public static void main(String []args){
		
		//Creating scanner class to read input from the user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter title of the book: ");
		String title = sc.nextLine();
		
		System.out.print("Enter author: ");
		String author = sc.nextLine();
		
		System.out.print("Enter price: ");
		int price = sc.nextInt();
		
		//Creating object
		Book book1 = new Book(title, author, price);
		System.out.println("Details of the book are: ");
		
		//calling displayDetails method using employee1 reference variable
		book1.displayDetails();
	}
}