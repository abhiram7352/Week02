package Day04_Diagrams.class_object_modeling;

import java.util.List;
import java.util.ArrayList;

// Class representing a customer
class Customer {
    private String name;
    private List<Product> products;
     //Customer's constructor
    public Customer(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }
    //returning the name
    public String getName() {
        return name;
    }
    // returning the products
    public List<Product> getProducts() {
        return products;
    }

    //Adding product to cart
    public void addProduct(Product product) {
        products.add(product);
    }
}

// Class representing a product
class Product {
    //Attributes
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

// Class responsible for generating the bill
class BillGenerator {
    public double calculateTotal(Customer customer) {
        double total = 0;
        for (Product product : customer.getProducts()) {
            total += product.getPrice();
        }
        return total;
    }

    public void printBill(Customer customer) {
        double total = calculateTotal(customer);
        System.out.println("Bill for " + customer.getName() + ":");
        for (Product product : customer.getProducts()) {
            System.out.println(product.getName() + " - $" + product.getPrice());
        }
        System.out.println("Total: $" + total);
    }
}

public class ShoppingApplication {
    public static void main(String[] args) {
// Example Products
        Product laptop = new Product("Laptop", 1200);
        Product mouse = new Product("Mouse", 25);
        Product keyboard = new Product("Keyboard", 45);

// Example Customer
        Customer customer = new Customer("Alice");
        customer.addProduct(laptop);
        customer.addProduct(mouse);
        customer.addProduct(keyboard);

// Generate and print bill
        BillGenerator billGenerator = new BillGenerator();
        billGenerator.printBill(customer);
    }
}
