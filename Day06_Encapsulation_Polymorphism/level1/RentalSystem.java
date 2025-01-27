package Day06_Encapsulation_Polymorphism.level1;

import java.util.ArrayList;
import java.util.List;

// Abstract class Vehicle
abstract class Vehicle1 {
    // Encapsulated fields
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    // Constructor
    public Vehicle1(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Getter and setter methods
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    // Abstract method to calculate rental cost
    public abstract double calculateRentalCost(int days);

    // Concrete method to display vehicle details
    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate: " + rentalRate);
    }
}

// Interface Insurable
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

// Car class
class Car1 extends Vehicle1 implements Insurable {
    private String insurancePolicyNumber;

    public Car1(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, type, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 2000; // Flat insurance rate for example
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy Number: " + insurancePolicyNumber;
    }
}

// Bike class
class Bike1 extends Vehicle1 {
    public Bike1(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days - (days > 7 ? getRentalRate() : 0); // Discount for rentals over 7 days
    }
}

// Truck class
class Truck1 extends Vehicle1 implements Insurable {
    private String insurancePolicyNumber;

    public Truck1(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, type, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 50 * days; // Additional cost per day
    }

    @Override
    public double calculateInsurance() {
        return 5000; // Flat insurance rate for example
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy Number: " + insurancePolicyNumber;
    }
}

// RentalSystem class to demonstrate polymorphism
public class RentalSystem  {
    public static void main(String[] args) {
        // Create a list of vehicles
        List<Vehicle1> vehicles = new ArrayList<>();

        // Add car, bike, and truck to the list
        Vehicle1 car = new Car1("KA-01-12345", "Car", 1000, "CAR-INS-001");
        Vehicle1 bike = new Bike1("KA-02-67890", "Bike", 500);
        Vehicle1 truck = new Truck1("KA-03-13579", "Truck", 2000, "TRUCK-INS-001");

        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(truck);

        // Process and display vehicle details using polymorphism
        int rentalDays = 10; // Example rental duration

        for (Vehicle1 vehicle : vehicles) {
            vehicle.displayDetails();
            double rentalCost = vehicle.calculateRentalCost(rentalDays);
            double insuranceCost = 0;
            if (vehicle instanceof Insurable) {
                insuranceCost = ((Insurable) vehicle).calculateInsurance();
                System.out.println(((Insurable) vehicle).getInsuranceDetails());
            }
            System.out.println("Rental Cost for " + rentalDays + " days: " + rentalCost);
            System.out.println("Insurance Cost: " + insuranceCost);
            System.out.println("Total Cost: " + (rentalCost + insuranceCost));
            System.out.println();
        }
    }
}
