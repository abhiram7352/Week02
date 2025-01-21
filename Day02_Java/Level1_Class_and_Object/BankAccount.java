package Day02_Java.Level1_Class_and_Object;

public class BankAccount {
    // Public instance variable
    public String accountNumber;

    // Protected instance variable
    protected String accountHolder;

    // Private instance variable
    private double balance;

    // Constructor to initialize bank account details
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to get the balance
    public double getBalance() {
        return balance;
    }

    // Public method to set the balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to display bank account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

// Subclass to demonstrate access to accountNumber and accountHolder
class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor to initialize savings account details
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Method to display savings account details
    public void displaySavingsAccountDetails() {
        System.out.println("Account Number: " + accountNumber); // Access public member
        System.out.println("Account Holder: " + accountHolder); // Access protected member
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", "Abhiram", 5000);
        account.displayAccountDetails();

        // Modify balance
        account.setBalance(6000);
        System.out.println("Updated Balance: " + account.getBalance());

        SavingsAccount savingsAccount = new SavingsAccount("987654321", "Rahul", 7000, 2.5);
        savingsAccount.displaySavingsAccountDetails();
    }
}
