package Day02_Java.Level1_Class_and_Object;

//creating a class Book
public class Book {
    //Atributes
    String title;
    String author;
    int price;
    //default constructor
    Book(){

    }
    //parametirized constructor
    Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    //printIfo method to print details
    void printInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("price: " + price);
    }

    public static void main(String[] agrs){
        Book b = new Book("Love is Scam", "Abhiram", 10);

        //Calling method printInfo using b reference variable
        b.printInfo();
    }
}

