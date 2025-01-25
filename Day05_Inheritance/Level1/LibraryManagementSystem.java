package Day05_Inheritance.Level1;

import java.net.Authenticator;

class Book{
    String title;
    int publicationYear;

    Book(String title, int publicationYear){
        this.title=title;
        this.publicationYear=publicationYear;

    }

    void displayDetails(){
        System.out.println("Book title: "+title);
        System.out.println("Book Publication Year: "+ publicationYear);
    }
}

class Auhtor extends Book{
    String name;
    String bio;
    Auhtor(String title, int publicationYear, String name, String bio){
        super(title, publicationYear);
        this.name=name;
        this.bio=bio;
    }

    void displayInfo(){
        super.displayDetails();
        System.out.println("Author name: "+ name);
        System.out.println("Bio: "+ bio);

    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Auhtor car = new Auhtor("Love is war", 2024, "Abhiram", "Intekam dekhegi");

        car.displayInfo();
    }
}
