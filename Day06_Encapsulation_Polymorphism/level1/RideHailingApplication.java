package Day06_Encapsulation_Polymorphism.level1;

// Abstract class Vehicle
abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    // Constructor
    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Abstract method to calculate fare
    public abstract double calculateFare(double distance);

    // Concrete method to get vehicle details
    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + ", Driver Name: " + driverName + ", Rate per Km: " + ratePerKm;
    }

    // Getter for ratePerKm
    public double getRatePerKm() {
        return ratePerKm;
    }
}

// Interface GPS
interface GPS {
    String getCurrentLocation();

    void updateLocation(String newLocation);
}

// Subclass Car
class Car extends Vehicle implements GPS {
    private String currentLocation;

    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        currentLocation = newLocation;
    }
}

// Subclass Bike
class Bike extends Vehicle implements GPS {
    private String currentLocation;

    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        currentLocation = newLocation;
    }
}

// Subclass Auto
class Auto extends Vehicle implements GPS {
    private String currentLocation;

    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        currentLocation = newLocation;
    }
}

// Main class to demonstrate polymorphism
public class RideHailingApplication {
    public static void main(String[] args) {
        // Creating instances of different vehicle types
        Vehicle car = new Car("C213", "Rahul Kumar",  15.0);
        Vehicle bike = new Bike("B342", "Hritk Maurya", 34);
        Vehicle auto = new Auto("A346", "Vinay Gautam",10.0);

        // Calculate fares dynamically using polymorphism
        System.out.println(car.getVehicleDetails());
        System.out.println("Fare for 10 km: " + car.calculateFare(10));

        System.out.println(bike.getVehicleDetails());
        System.out.println("Fare for 10 km: " + bike.calculateFare(10));

        System.out.println(auto.getVehicleDetails());
        System.out.println("Fare for 10 km: " + auto.calculateFare(10));

        // Demonstrating GPS functionality
        GPS carGPS = (GPS) car;
        carGPS.updateLocation("Downtown");
        System.out.println("Car current location: " + carGPS.getCurrentLocation());

        GPS bikeGPS = (GPS) bike;
        bikeGPS.updateLocation("Central Park");
        System.out.println("Bike current location: " + bikeGPS.getCurrentLocation());

        GPS autoGPS = (GPS) auto;
        autoGPS.updateLocation("Suburbs");
        System.out.println("Auto current location: " + autoGPS.getCurrentLocation());
    }
}

