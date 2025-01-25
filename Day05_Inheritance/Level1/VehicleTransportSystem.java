package Day05_Inheritance.Level1;
class Vehicle{
    //Attributes
    int maxSpeed;
    String fuelType;


    Vehicle(int maxSpeed, String fuelType){
        this.maxSpeed=maxSpeed;
        this.fuelType=fuelType;
    }

    void displayInfo(){
        System.out.println("Speed of the vehicle: "+ maxSpeed);
        System.out.println("Type of the fuel: "+ fuelType);
    }
}

class Car extends Vehicle{
    int seatCapacity;
    Car(int maxSpeed, String fuelType, int seatCapacity){
        super(maxSpeed, fuelType);
        this.seatCapacity=seatCapacity;
    }
    void displayInfo(){
        super.displayInfo();
        System.out.println("Seating capacity of car: "+ seatCapacity);
    }
}
class Truck extends Vehicle{
    int load;
    Truck(int maxSpeed, String fuelType, int load){
        super(maxSpeed, fuelType);
        this.load=load;
    }
    void displayInfo(){
        super.displayInfo();
        System.out.println("Loading Capacity of truck: "+ load);
    }
}
class MotorCycle extends Vehicle{
    String bikeName ;
    MotorCycle(int maxSpeed, String fuelType, String bikeName){
        super(maxSpeed, fuelType);
        this.bikeName=bikeName;
    }
    void displayInfo(){
        super.displayInfo();
        System.out.println("Bike name: "+ bikeName);
    }
}
public class VehicleTransportSystem {
    public static void main(String[] args) {
        Vehicle car = new Car(200, "petrol", 6);
        Vehicle truck = new Truck(70, "Diesel", 2000);
        Vehicle motorCycle = new MotorCycle(140, "Petrol", "KTM");


        Vehicle[] vh = {car, truck, motorCycle};

        for(Vehicle v: vh){
            v.displayInfo();
        }

    }
}
