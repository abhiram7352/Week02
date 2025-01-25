package Day05_Inheritance.Level1;

// Superclass for Gaadi (Vehicle)
class Gaadi {
    int maxSpeed;  // Attribute for the maximum speed of the vehicle
    String model;  // Attribute for the model of the vehicle

    // Constructor to initialize maxSpeed and model
    Gaadi(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    // Method to display vehicle details
    void displayGaadiDetails() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

// Interface for Refuelable
interface Refuelable {
    void refuel();  // Method to refuel the vehicle
}

// Subclass for ElectricVehicle
class ElectricVehicle extends Gaadi {
    // Constructor to initialize maxSpeed and model for ElectricVehicle
    ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);  // Call to superclass constructor
    }

    // Method to display the role of the vehicle
    void charge() {
        System.out.println("Charging the electric vehicle...");
    }

    // Overridden method to display electric vehicle details
    @Override
    void displayGaadiDetails() {
        super.displayGaadiDetails();  // Call to superclass method to display common details
        System.out.println("Vehicle Type: Electric");
    }
}

// Subclass for PetrolVehicle implementing Refuelable
class PetrolVehicle extends Gaadi implements Refuelable {
    // Constructor to initialize maxSpeed and model for PetrolVehicle
    PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);  // Call to superclass constructor
    }

    // Method to refuel the petrol vehicle
    @Override
    public void refuel() {
        System.out.println("Refueling the petrol vehicle...");
    }

    // Overridden method to display petrol vehicle details
    @Override
    void displayGaadiDetails() {
        super.displayGaadiDetails();  // Call to superclass method to display common details
        System.out.println("Vehicle Type: Petrol");
    }
}

// Main class to demonstrate the hierarchy
public class VehicleManagementSystem {
    public static void main(String[] args) {
        // Creating an instance of ElectricVehicle
        ElectricVehicle electricVehicle = new ElectricVehicle(150, "Tesla Model 3");
        System.out.println("Electric Vehicle Details:");
        electricVehicle.displayGaadiDetails();
        electricVehicle.charge();

        System.out.println();

        // Creating an instance of PetrolVehicle
        PetrolVehicle petrolVehicle = new PetrolVehicle(200, "Toyota Corolla");
        System.out.println("Petrol Vehicle Details:");
        petrolVehicle.displayGaadiDetails();
        petrolVehicle.refuel();
    }
}
