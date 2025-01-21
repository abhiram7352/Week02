package Day03_Keyword_Practice_Problem.Level1;

public class Patient {
    // Static attribute
    static String hospitalName = "City Hospital";

    // Static variable to track total number of patients
    static int totalPatients = 0;

    // Instance attributes
    String name;
    int age;
    String ailment;
    final int patientID;

    // Constructor
    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;  // Increment the total patients count
    }

    // Static method to get the total number of patients
    public static void getTotalPatients() {
        System.out.println("Total number of patients: " + totalPatients);
    }

    // Method to display patient details
    public void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient Name: " + name);
            System.out.println("Patient Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Patient ID: " + patientID);
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating patient objects
        Patient patient1 = new Patient("Dhan Sign", 45, "Cardiac", 101);
        Patient patient2 = new Patient("Narayna Murti", 30, "Neurology", 102);

        // Displaying details of each patient
        patient1.displayDetails();
        System.out.println();
        patient2.displayDetails();
        System.out.println();

        // Displaying the total number of patients admitted
        Patient.getTotalPatients();
    }
}
