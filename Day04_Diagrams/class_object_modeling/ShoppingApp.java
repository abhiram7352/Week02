package Day04_Diagrams.class_object_modeling;

import java.util.List;
import java.util.ArrayList;

// Class representing a client
class Client {
    private String name;
    private List<Item> items;

    public Client(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        items.add(item);
    }
}

// Class representing an item
class Item {
    private String name;
    private double unitPrice;
    private double quantity;

    public Item(String name, double unitPrice, double quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return unitPrice * quantity;
    }
}

// Main class
public class ShoppingApp {
    public static void main(String[] args) {
        // Items purchased by Alice
        Item apples = new Item("Apples", 3.0, 2.0);  // 2 kg at $3 per kg
        Item milk = new Item("Milk", 2.0, 1.0);     // 1 liter at $2 per liter

        // Client Alice
        Client alice = new Client("Alice");
        alice.addItem(apples);
        alice.addItem(milk);

        // Printing details
        System.out.println("Client: " + alice.getName());
        for (Item item : alice.getItems()) {
            System.out.println("Item: " + item.getName() + " - " + item.getQuantity() + " units at $" + item.getUnitPrice() + " each");
        }
    }
}
