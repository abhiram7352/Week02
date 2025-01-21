import java.util.Scanner;
//creating PalindromeChecker  class
class PalindromeChecker  {
	
	//Atribute
    String text;
    
    // Constructor
    PalindromeChecker(String text) {
		
        this.text = text;

    }
	
	 //isPalindrome methos to check palindrome money
	 public boolean isPalindrome(String text){
		 String reversedStr = "";
		 for(int i=text.length()-1; i>=0; i--){
			 reversedStr += text.charAt(i);
		 }
		 if(reversedStr.equals(text)){
			return true;
	     }
		 return false;
		 	 
	 }
    

    void displayDetails() {
          boolean isPalin= isPalindrome(text);
		  if(isPalin){
			  System.out.println("Given text is palidrome");
		  }else{
			  System.out.println("Given text is not palidrome");
		  }
}
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text: ");
		String text = sc.nextLine();
			
	    //Creating object of the PalindromeChecker  class
        PalindromeChecker  pc = new PalindromeChecker (text);
		
		pc.displayDetails();
      
		
		
    }
}
