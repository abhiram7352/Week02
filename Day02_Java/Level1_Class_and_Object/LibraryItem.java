package Day02_Java.Level1_Class_and_Object;

public class LibraryItem {
    // Public instance variable
    public String ISBN;

    // Protected instance variable
    protected String title;

    // Private instance variable
    private String author;

    // Constructor to initialize library item details
    public LibraryItem(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public method to set the author name
    public void setAuthor(String author) {
        this.author = author;
    }

    // Public method to get the author name
    public String getAuthor() {
        return author;
    }

    // Method to display library item details
    public void displayLibraryItemDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass to demonstrate access modifiers
class EBook extends LibraryItem {
    private String downloadLink;

    // Constructor to initialize eBook details
    public EBook(String ISBN, String title, String author, String downloadLink) {
        super(ISBN, title, author);
        this.downloadLink = downloadLink;
    }

    // Method to display eBook details
    public void displayEBookDetails() {
        System.out.println("ISBN: " + ISBN); // Access public member
        System.out.println("Title: " + title); // Access protected member
        System.out.println("Download Link: " + downloadLink);
    }

    public static void main(String[] args) {
        LibraryItem item = new LibraryItem("123-4567890123", "Java Programming", "Abhiram");
        item.displayLibraryItemDetails();

        // Set and get author
        item.setAuthor("Rahul Jain");
        System.out.println("Updated Author: " + item.getAuthor());

        EBook eBook = new EBook("789-1234567890", "Advanced Java", "Shrishant", "www.ebooks.com/advancedjava");
        eBook.displayEBookDetails();
    }
}
