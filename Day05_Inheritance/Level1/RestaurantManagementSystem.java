package Day05_Inheritance.Level1;

//Superclass for Person
class Person {
    String name;  // Attribute for name of the person
    int id;  // Attribute for ID of the person

    // Constructor to initialize name and ID
    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display person details
    void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Interface for Worker
interface Worker {
    void performDuties();  // Method to perform duties specific to the worker's role
}

// Subclass for Chef implementing Worker interface
class Chef extends Person implements Worker {
    // Constructor to initialize name and ID for Chef
    Chef(String name, int id) {
        super(name, id);  // Call to superclass constructor
    }

    // Method to perform duties specific to the Chef
    @Override
    public void performDuties() {
        System.out.println(name + " is cooking delicious meals.");
    }

    // Overridden method to display chef details
    @Override
    void displayPersonDetails() {
        super.displayPersonDetails();  // Call to superclass method to display common details
        System.out.println("Role: Chef");
    }
}

// Subclass for Waiter implementing Worker interface
class Waiter extends Person implements Worker {
    // Constructor to initialize name and ID for Waiter
    Waiter(String name, int id) {
        super(name, id);  // Call to superclass constructor
    }

    // Method to perform duties specific to the Waiter
    @Override
    public void performDuties() {
        System.out.println(name + " is serving customers and taking orders.");
    }

    // Overridden method to display waiter details
    @Override
    void displayPersonDetails() {
        super.displayPersonDetails();  // Call to superclass method to display common details
        System.out.println("Role: Waiter");
    }
}

// Main class to demonstrate the hierarchy
public class RestaurantManagementSystem {
    public static void main(String[] args) {
        // Creating an instance of Chef
        Chef chef = new Chef("Gordon Ramsay", 101);
        System.out.println("Chef Details:");
        chef.displayPersonDetails();
        chef.performDuties();

        System.out.println();

        // Creating an instance of Waiter
        Waiter waiter = new Waiter("James Smith", 102);
        System.out.println("Waiter Details:");
        waiter.displayPersonDetails();
        waiter.performDuties();
    }
}
