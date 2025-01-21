import java.util.Scanner;
//creating BankAccoun
class Bank{
    String accountHolder;
    int accountNumber;
    int balance;


    // Constructor
    Bank(String accountHolder, int accountNumber, int balance) {
		
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;

    }
	
     public void depositMoney(int amount){
		 
			 balance += amount;
		 	 
	 }
	 public void widrawMoney(int money){
		 
		 if(money <= balance){
			 balance -= money;
		 }	 
	 }
    
    void displayDetails() {
        System.out.print("Account Holder: "+accountHolder);
		System.out.print("Account Number: "+accountNumber);
		System.out.print("Account balance: "+balance);
    }

}
public class Main{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your account Holder: ");
		String accountHolder = sc.nextLine();
		
		System.out.println("Enter your account Number: ");
		int accountNumber = sc.nextInt();
		
		System.out.println("Enter your Marks: ");
		int balance = sc.nextInt();
	
		System.out.println("Enter amount you want to deposit: ");
		int amount = sc.nextInt();
		
		System.out.println("Enter amount you want to widraw: ");
		int money = sc.nextInt();
		
		
		//Creating object of the Student class
         Bank account = new Bank(accountHolder, accountNumber, balance);
		
		//calling displayDetails using account reference variable
        account.displayDetails(); 
		account.widrawMoney(money);
		account.depositMoney(amount);
    }
}
