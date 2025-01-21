package Day03_Keyword_Practice_Problem.Level1;

public class Product {
    // Static variable for discount shared across all products
    static double discount = 10.0; // Default discount in percentage

    // Instance variables
    final int productID; // Final variable to ensure unique identifier
    String productName;
    double price;
    int quantity;

    // Constructor to initialize product details using 'this'
    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Static method to update the discount percentage
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    // Method to calculate the final price after applying the discount
    public double calculateFinalPrice() {
        double discountAmount = (price * discount) / 100;
        return (price - discountAmount) * quantity;
    }

    // Method to display product details with instanceof validation
    public void displayProductDetails(Object obj) {
        if (obj instanceof Product) {
            Product product = (Product) obj;
            System.out.println("Product ID: " + product.productID);
            System.out.println("Product Name: " + product.productName);
            System.out.println("Price per Unit: $" + product.price);
            System.out.println("Quantity: " + product.quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Final Price: $" + product.calculateFinalPrice());
        } else {
            System.out.println("Invalid object. Not an instance of Product.");
        }
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        // Create Product objects
        Product product1 = new Product(1, "Laptop", 800.00, 1);
        Product product2 = new Product(2, "Smartphone", 500.00, 2);

        // Display product details
        System.out.println("Before Discount Update:");
        product1.displayProductDetails(product1);
        System.out.println();
        product2.displayProductDetails(product2);

        // Update the discount
        Product.updateDiscount(15.0); // Change discount to 15%

        System.out.println("\nAfter Discount Update:");
        product1.displayProductDetails(product1);
        System.out.println();
        product2.displayProductDetails(product2);
    }
}
