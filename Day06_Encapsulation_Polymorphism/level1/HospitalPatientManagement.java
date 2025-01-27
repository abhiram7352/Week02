package Day06_Encapsulation_Polymorphism.level1;
import java.util.ArrayList;
import java.util.List;

// Abstract class Patient
abstract class Patient {
    // Encapsulated fields
    private String patientId;
    private String name;
    private int age;

    // Constructor
    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Getter and setter methods
    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Abstract method to calculate bill
    public abstract double calculateBill();

    // Concrete method to get patient details
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Interface MedicalRecord
interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

// InPatient class
class InPatient extends Patient implements MedicalRecord {
    private double dailyRate;
    private int daysAdmitted;
    private List<String> medicalHistory;

    public InPatient(String patientId, String name, int age, double dailyRate, int daysAdmitted) {
        super(patientId, name, age);
        this.dailyRate = dailyRate;
        this.daysAdmitted = daysAdmitted;
        this.medicalHistory = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return dailyRate * daysAdmitted;
    }

    @Override
    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical History: " + medicalHistory);
    }
}

// OutPatient class
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private List<String> medicalHistory;

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.medicalHistory = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical History: " + medicalHistory);
    }
}

// Main class to demonstrate polymorphism
public class HospitalPatientManagement {
    public static void main(String[] args) {
        // Create a list of patients
        List<Patient> patients = new ArrayList<>();

        // Add inpatients and outpatients to the list
        Patient inPatient = new InPatient("IP001", "Rahul Kumar", 30, 2000, 5);
        Patient outPatient = new OutPatient("OP001", "Rahul Kumar", 25, 500);

        patients.add(inPatient);
        patients.add(outPatient);

        // Process and display patient details using polymorphism
        for (Patient patient : patients) {
            patient.getPatientDetails();
            double bill = patient.calculateBill();
            System.out.println("Total Bill: " + bill);

            if (patient instanceof MedicalRecord) {
                MedicalRecord medicalRecord = (MedicalRecord) patient;
                medicalRecord.addRecord("Check-up record on " + (patient.getPatientId().equals("IP001") ? "25th Jan" : "24th Jan"));
                medicalRecord.viewRecords();
            }
            System.out.println();
        }
    }
}

