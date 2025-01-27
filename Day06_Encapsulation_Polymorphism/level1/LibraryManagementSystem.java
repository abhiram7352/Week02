package Day06_Encapsulation_Polymorphism.level1;
import java.util.ArrayList;
import java.util.List;

// Abstract class LibraryItem
abstract class LibraryItem {
    // Encapsulated fields
    private String itemId;
    private String title;
    private String author;

    // Constructor
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Getter and setter methods
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Abstract method to get loan duration
    public abstract int getLoanDuration();

    // Concrete method to get item details
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Interface Reservable
interface Reservable {
    void reserveItem(String borrower);
    boolean checkAvailability();
}

// Book class
class Book extends LibraryItem implements Reservable {
    private String borrower;
    private boolean isAvailable;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isAvailable = true;
    }

    @Override
    public int getLoanDuration() {
        return 21; // Loan duration for books is 21 days
    }

    @Override
    public void reserveItem(String borrower) {
        this.borrower = borrower;
        this.isAvailable = false;
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

// Magazine class
class Magazine extends LibraryItem implements Reservable {
    private String borrower;
    private boolean isAvailable;

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isAvailable = true;
    }

    @Override
    public int getLoanDuration() {
        return 14; // Loan duration for magazines is 14 days
    }

    @Override
    public void reserveItem(String borrower) {
        this.borrower = borrower;
        this.isAvailable = false;
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

// DVD class
class DVD extends LibraryItem {
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // Loan duration for DVDs is 7 days
    }
}

// Main class to demonstrate polymorphism
public class LibraryManagementSystem  {
    public static void main(String[] args) {
        // Create a list of library items
        List<LibraryItem> items = new ArrayList<>();

        // Add books, magazines, and DVDs to the list
        LibraryItem book = new Book("B001", "Godan", "Rambriksh Benipuri");
        LibraryItem magazine = new Magazine("M001", "Time", "Henry Luce");
        LibraryItem dvd = new DVD("D001", "Inception", "Christopher Nolan");

        items.add(book);
        items.add(magazine);
        items.add(dvd);

        // Process and display item details using polymorphism
        for (LibraryItem item : items) {
            item.getItemDetails();
            int loanDuration = item.getLoanDuration();
            System.out.println("Loan Duration: " + loanDuration + " days");

            if (item instanceof Reservable) {
                Reservable reservableItem = (Reservable) item;
                reservableItem.reserveItem("Abhiram Kumar");
                System.out.println("Availability: " + reservableItem.checkAvailability());
            }
            System.out.println();
        }
    }
}

