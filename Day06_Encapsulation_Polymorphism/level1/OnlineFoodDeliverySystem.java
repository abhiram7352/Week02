package Day06_Encapsulation_Polymorphism.level1;
import java.util.ArrayList;
import java.util.List;

// Abstract class FoodItem
abstract class FoodItem {
    // Encapsulated fields
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter and setter methods
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Abstract method to calculate total price
    public abstract double calculateTotalPrice();

    // Concrete method to get item details
    public void getItemDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}

// Interface Discountable
interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

// VegItem class
class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.1; // 10% discount
    }

    @Override
    public String getDiscountDetails() {
        return "Discount: 10%";
    }
}

// NonVegItem class
class NonVegItem extends FoodItem implements Discountable {
    private double additionalCharges;

    public NonVegItem(String itemName, double price, int quantity, double additionalCharges) {
        super(itemName, price, quantity);
        this.additionalCharges = additionalCharges;
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + additionalCharges;
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05; // 5% discount
    }

    @Override
    public String getDiscountDetails() {
        return "Discount: 5%";
    }
}

// Main class to demonstrate polymorphism
public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        // Create a list of food items
        List<FoodItem> foodItems = new ArrayList<>();

        // Add veg and non-veg items to the list
        FoodItem vegItem = new VegItem("Paneer Tikka", 150, 2);
        FoodItem nonVegItem = new NonVegItem("Chicken Biryani", 250, 3, 50);

        foodItems.add(vegItem);
        foodItems.add(nonVegItem);

        // Process and display food item details using polymorphism
        for (FoodItem foodItem : foodItems) {
            foodItem.getItemDetails();
            double totalPrice = foodItem.calculateTotalPrice();
            System.out.println("Total Price: " + totalPrice);

            if (foodItem instanceof Discountable) {
                Discountable discountableItem = (Discountable) foodItem;
                double discount = discountableItem.applyDiscount();
                System.out.println(discountableItem.getDiscountDetails());
                System.out.println("Final Price after Discount: " + (totalPrice - discount));
            }
            System.out.println();
        }
    }
}
