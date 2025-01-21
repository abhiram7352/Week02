import java.util.ArrayList;
import java.util.Scanner;

class CartItem {
    String itemName;
    double price;
    int quantity;

    // Constructor
    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Get the total cost for this item
    public double getTotalCost() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return "Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity + ", Total: " + getTotalCost();
    }
}

class ShoppingCart {
    private ArrayList<CartItem> cart;

    // Constructor
    ShoppingCart() {
        cart = new ArrayList<>();
    }

    // Add an item to the cart
    public void addItem(String itemName, double price, int quantity) {
        cart.add(new CartItem(itemName, price, quantity));
        System.out.println("Item added to cart: " + itemName);
    }

    // Remove an item from the cart
    public void removeItem(String itemName) {
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).itemName.equalsIgnoreCase(itemName)) {
                System.out.println("Item removed from cart: " + itemName);
                cart.remove(i);
                return;
            }
        }
        System.out.println("Item not found in the cart: " + itemName);
    }

    // Display the total cost of the cart
    public void displayTotalCost() {
        double totalCost = 0;
        for (CartItem item : cart) {
            totalCost += item.getTotalCost();
        }
        System.out.println("Total cost of your cart: INR " + totalCost);
    }

    // Display all items in the cart
    public void displayCart() {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty.");
            return;
        }
        System.out.println("Items in your cart:");
        for (CartItem item : cart) {
            System.out.println(item);
        }
    }
}

class ShoppingCartSystem {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nShopping Cart Menu:");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Display Cart");
            System.out.println("4. Display Total Cost");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String itemName = sc.nextLine();
                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = sc.nextInt();
                    cart.addItem(itemName, price, quantity);
                    break;

                case 2:
                    System.out.print("Enter the item name to remove: ");
                    String removeName = sc.nextLine();
                    cart.removeItem(removeName);
                    break;

                case 3:
                    cart.displayCart();
                    break;

                case 4:
                    cart.displayTotalCost();
                    break;

                case 5:
                    System.out.println("Exiting... Thank you for shopping!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);

        sc.close(); // Close the scanner
    }
}
