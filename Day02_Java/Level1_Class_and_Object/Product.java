package Day02_Java.Level1_Class_and_Object;

public class Product {
    // Class variable to keep track of total products created
    private static int totalProducts = 0;

    // Instance variables
    private String productName;
    private double price;

    // Constructor to initialize product details and increment totalProducts
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    // Class method to display the total number of products created
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    // Main method for testing
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 45000);
        Product product2 = new Product("Smartphone", 15000);

        product1.displayProductDetails();
        product2.displayProductDetails();

        Product.displayTotalProducts();
    }
}
