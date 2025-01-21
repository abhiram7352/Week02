package Day03_Keyword_Practice_Problem.Level1;

public class BankAccount {
    //Attribute
    static String bankName = "State Bank of India";
    String accountHolderName;
    final int accountNumber;
    private static int totalAccount = 0;

    // Parameterized constructor
    BankAccount(String accountHolderName,int  accountNumber){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccount++;
    }

    //counting total account
    static int getTotalAccounts(){
        return totalAccount++;
    }


    //Displaying details of the
     void displayDetails(){
        if(this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account holder Name: " + accountHolderName);
            System.out.println("Account  Number: " + accountNumber);
            System.out.println("Total Account: " + totalAccount);
        }else{
            System.out.println("Invalid Object");
        }
    }



    public static void main(String[] args) {
        //Calling BankAccount using account1 as a reference method
        BankAccount account1 = new BankAccount("Ramesh", 01111);

         account1.displayDetails();
        //Calling BankAccount using account2 as a reference method
        BankAccount account2 = new BankAccount("Mitesh", 11101);
        account2.displayDetails();


    }
}
