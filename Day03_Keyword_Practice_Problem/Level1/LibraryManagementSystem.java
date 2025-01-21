package Day03_Keyword_Practice_Problem.Level1;

public class LibraryManagementSystem {

    //Make libraryName static to share static variable across all books
    static String libraryName = "Central Library";
    String title;
    String author;
    final String isbn; //Final to ensure uniqueness

    //Cinstructor using 'this' keyword
    LibraryManagementSystem(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    //Static method to display library name
    static void displayLibraryName(){
        System.out.println("Library Name is: "+ libraryName);
    }

    //method to display details
    void displayDetails(){
        if(this instanceof LibraryManagementSystem){
            System.out.println("Library Name: "+ libraryName);
            System.out.println("Book Title: "+ title);
            System.out.println("Book Author Name: "+ author);
            System.out.println("Book ISBM: "+ isbn);

        }else{
            System.out.println("Invalid object");
        }
    }

    public static void main(String[] args) {

        // Create a book object
        LibraryManagementSystem book = new LibraryManagementSystem("Money is everything", "Abhiram kumar", "11UN2025");

        //Display book details
        book.displayDetails();

        //Displaying Lirbrarry name using static method
       book.displayLibraryName();

    }
}
