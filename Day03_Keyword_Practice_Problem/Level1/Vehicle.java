package Day03_Keyword_Practice_Problem.Level1;

public class Vehicle {
    // Static attributes
    static double registrationFee = 1000.0; // Default registration fee

    // Instance attributes
    String ownerName;
    String vehicleType;
    final String registrationNumber;

    // Constructor
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Static method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: " + registrationFee);
    }

    // Method to display vehicle details
    public void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating vehicle objects
        Vehicle vehicle1 = new Vehicle("Rahul Kumar", "Car", "REG12345");
        Vehicle vehicle2 = new Vehicle("Hiritk Maurya", "Bike", "REG67890");

        // Displaying details of each vehicle
        vehicle1.displayDetails();
        System.out.println();
        vehicle2.displayDetails();
        System.out.println();

        // Updating registration fee
        Vehicle.updateRegistrationFee(1500.0);

        // Displaying details again to reflect the updated fee
        System.out.println("After updating the registration fee:");
        vehicle1.displayDetails();
        System.out.println();
        vehicle2.displayDetails();
    }
}
