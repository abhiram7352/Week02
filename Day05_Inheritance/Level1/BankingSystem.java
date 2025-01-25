package Day05_Inheritance.Level1;

// Base class for Bank Account
class BankAccount {
    String accountNumber;
    double balance;

    // Constructor to initialize accountNumber and balance
    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to display account details
    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

// Subclass for Savings Account
class SavingsAccount extends BankAccount {

    double interestRate;

    // Constructor to initialize accountNumber, balance, and interest rate
    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);  // Call to superclass constructor
        this.interestRate = interestRate;
    }

    // Method to display account type
    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }

    // Overridden method to display account details including interest rate
    @Override
    void displayAccountDetails() {
        super.displayAccountDetails();  // Call to superclass method to display common details
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Subclass for Checking Account
class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    // Constructor to initialize accountNumber, balance, and withdrawal limit
    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);  // Call to superclass constructor
        this.withdrawalLimit = withdrawalLimit;
    }

    // Method to display account type
    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }

    // Overridden method to display account details including withdrawal limit
    @Override
    void displayAccountDetails() {
        super.displayAccountDetails();  // Call to superclass method to display common details
        System.out.println("Withdrawal Limit: $" + withdrawalLimit);
    }
}

// Subclass for Fixed Deposit Account
class FixedDepositAccount extends BankAccount {
    String maturityDate;

    // Constructor to initialize accountNumber, balance, and maturity date
    FixedDepositAccount(String accountNumber, double balance, String maturityDate) {
        super(accountNumber, balance);  // Call to superclass constructor
        this.maturityDate = maturityDate;
    }

    // Method to display account type
    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }

    // Overridden method to display account details including maturity date
    @Override
    void displayAccountDetails() {
        super.displayAccountDetails();  // Call to superclass method to display common details
        System.out.println("Maturity Date: " + maturityDate);
    }
}

// Main class to demonstrate the hierarchical inheritance
public class BankingSystem {
    public static void main(String[] args) {
        // Creating an instance of SavingsAccount
        SavingsAccount savings = new SavingsAccount("SA123456", 1000.0, 3.5);
        System.out.println("Savings Account Details:");
        savings.displayAccountType();
        savings.displayAccountDetails();

        System.out.println();

        // Creating an instance of CheckingAccount
        CheckingAccount checking = new CheckingAccount("CA123456", 500.0, 1000.0);
        System.out.println("Checking Account Details:");
        checking.displayAccountType();
        checking.displayAccountDetails();

        System.out.println();

        // Creating an instance of FixedDepositAccount
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD123456", 2000.0, "2025-12-31");
        System.out.println("Fixed Deposit Account Details:");
        fixedDeposit.displayAccountType();
        fixedDeposit.displayAccountDetails();
    }
}
