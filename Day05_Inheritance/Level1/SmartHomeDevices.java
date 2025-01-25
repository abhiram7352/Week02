package Day05_Inheritance.Level1;

class Device{
    //Attributes
    int deviceId;
    String status;

    //Constructor
    Device(int deviceID, String status){
        this.deviceId=deviceID;
        this.status=status;
    }

    //Displaying general details
    void displayGeneralDetails(){
        System.out.println("Device ID: "+ deviceId);
        System.out.println("Status: "+ status);
    }

}

class Thermostat extends Device{
    //subclass additional attributes
    String temperatureSetting;
    Thermostat(int deviceId, String status,String temperatureSetting){
        super(deviceId,status);
        this.temperatureSetting = temperatureSetting;
    }
     //Displaying additional details
    void displayStatus(){
        super.displayGeneralDetails();
        System.out.println("Temperature setting: "+ temperatureSetting);
    }
}

//Main method
public class SmartHomeDevices {
    public static void main(String[] args) {

        //Creating object of the subclass having reference variable thermostat;
        Thermostat thermostat = new Thermostat(34, "Charging", "Done");

        //Calling displayStatus
        thermostat.displayStatus();
    }
}
