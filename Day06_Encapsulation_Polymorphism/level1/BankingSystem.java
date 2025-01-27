package Day06_Encapsulation_Polymorphism.level1;

import java.util.ArrayList;
import java.util.List;

// Abstract class BankAccount
abstract class BankAccount {
    // Encapsulated fields
    private String accountNumber;
    private String holderName;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Getter and setter methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Concrete methods to deposit and withdraw money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    // Abstract method to calculate interest
    public abstract double calculateInterest();

    // Concrete method to display account details
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

// Interface Loanable
interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility(double amount);
}

// SavingsAccount class
class SavingsAccount extends BankAccount {
    private double interestRate; // annual interest rate in percentage

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * (interestRate / 100);
    }
}

// CurrentAccount class
class CurrentAccount extends BankAccount implements Loanable {
    private double interestRate; // annual interest rate in percentage
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String holderName, double balance, double interestRate, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * (interestRate / 100);
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan applied for: " + amount);
    }

    @Override
    public boolean calculateLoanEligibility(double amount) {
        return getBalance() >= amount / 2; // Example eligibility criteria
    }
}

// Main class to demonstrate polymorphism
public class BankingSystem {
    public static void main(String[] args) {
        // Create a list of bank accounts
        List<BankAccount> accounts = new ArrayList<>();

        // Add savings and current accounts to the list
        BankAccount savingsAccount = new SavingsAccount("SA12345", "Rahul Kumar", 50000, 4);
        BankAccount currentAccount = new CurrentAccount("CA12345", "Hritik Maurya", 30000, 3, 10000);

        accounts.add(savingsAccount);
        accounts.add(currentAccount);

        // Process and display account details using polymorphism
        for (BankAccount account : accounts) {
            account.displayDetails();
            double interest = account.calculateInterest();
            System.out.println("Interest: " + interest);
            if (account instanceof Loanable) {
                Loanable loanableAccount = (Loanable) account;
                loanableAccount.applyForLoan(20000);
                System.out.println("Loan Eligibility: " + loanableAccount.calculateLoanEligibility(20000));
            }
            System.out.println();
        }
    }
}

