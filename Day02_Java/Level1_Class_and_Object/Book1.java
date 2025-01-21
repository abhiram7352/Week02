package Day02_Java.Level1_Class_and_Object;

public class Book1 {

    // Attributes
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Constructor
    public Book1(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Getter and Setter methods
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }

    // Method to borrow a book
    public void borrowBook() {
        if (isAvailable) {
            System.out.println("You have successfully borrowed \"" + title + "\" by " + author);
            isAvailable = false; // Update availability status to false
        } else {
            System.out.println("Sorry, \"" + title + "\" by " + author + " is currently not available.");
        }
    }

    public static void main(String[] args) {
        // Create a book
        Book1 book1 = new Book1("1984", "George Orwell", 9.99, true);

        // Display book details
        book1.displayDetails();

        // Borrow the book
        System.out.println("\nAttempting to borrow the book...");
        book1.borrowBook();

        // Display book details again to see the change in availability
        System.out.println("\nBook details after borrowing:");
        book1.displayDetails();
    }
}
