import java.util.Scanner;
//creating BankAccount class
public class BankAccount {
    String accountHolder;
    int accountNumber;
    int balance;


    // Constructor
    BankAccount(String accountHolder, int accountNumber, int balance) {
		
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;

    }
	//depositMoney method to deposit money
     public void depositMoney(int amount){
		 
			 this.balance +=  amount;
		 	 
	 }
	 
	 //widrawMoney methos to widrawMoney money
	 public void widrawMoney(int money){
		 
		 if(money <= balance){
			 this.balance -= money;
		 }else{
			 System.out.println("Insufficient balance!!");
		 }	 
	 }
    
    public void displayDetails() {
        System.out.println("Account Holder: "+accountHolder);
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account balance: "+balance);
    }



    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your account Holder: ");
		String accountHolder = sc.nextLine();
		
		System.out.println("Enter your account Number: ");
		int accountNumber = sc.nextInt();
		
		System.out.println("Enter your Balance: ");
		int balance = sc.nextInt();
	
	    //Creating object of the Student class
        BankAccount account = new BankAccount(accountHolder, accountNumber, balance);
		
		System.out.println("Enter amount you want to deposit: ");
		int amount = sc.nextInt();
		account.depositMoney(amount);
		
		System.out.println("Enter amount you want to withdraw: ");
		int money = sc.nextInt();
		account.widrawMoney(money);
		
		
		
		//calling displayDetails using account reference variable
        account.displayDetails(); 
		
		
    }
}
