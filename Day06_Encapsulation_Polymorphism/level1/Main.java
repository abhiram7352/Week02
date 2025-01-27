package Day06_Encapsulation_Polymorphism.level1;

import java.util.ArrayList;
import java.util.List;

// Abstract class Employee
abstract class Employee {
    // Encapsulated fields
    private int employeeId;
    private String name;
    private double baseSalary;

    // Constructor
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Getter and setter methods
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // Abstract method to be implemented by subclasses
    public abstract double calculateSalary();

    // Concrete method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
    }
}

// Full-time employee subclass
class FullTimeEmployee extends Employee {
    private double fixedSalary;

    public FullTimeEmployee(int employeeId, String name, double baseSalary, double fixedSalary) {
        super(employeeId, name, baseSalary);
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + fixedSalary;
    }
}

// Part-time employee subclass
class PartTimeEmployee extends Employee {
    private int workHours;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId, String name, double baseSalary, int workHours, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.workHours = workHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (workHours * hourlyRate);
    }
}

// Department interface
interface Department {
    void assignDepartment(String department);
    String getDepartmentDetails();
}

// Full-time employee class with department
class FullTimeEmployeeWithDepartment extends FullTimeEmployee implements Department {
    private String department;

    public FullTimeEmployeeWithDepartment(int employeeId, String name, double baseSalary, double fixedSalary) {
        super(employeeId, name, baseSalary, fixedSalary);
    }

    @Override
    public void assignDepartment(String department) {
        this.department = department;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}

// Part-time employee class with department
class PartTimeEmployeeWithDepartment extends PartTimeEmployee implements Department {
    private String department;

    public PartTimeEmployeeWithDepartment(int employeeId, String name, double baseSalary, int workHours, double hourlyRate) {
        super(employeeId, name, baseSalary, workHours, hourlyRate);
    }

    @Override
    public void assignDepartment(String department) {
        this.department = department;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}

// Main class to demonstrate polymorphism
public class Main {
    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = new ArrayList<>();

        // Add full-time and part-time employees with department to the list
        FullTimeEmployee fte = new FullTimeEmployeeWithDepartment(1, "Shilpa Singh", 30000, 20000);
        PartTimeEmployee pte = new PartTimeEmployeeWithDepartment(2, "Rishav Raj", 15000, 20, 100);

        // Assign departments
        ((Department) fte).assignDepartment("HR");
        ((Department) pte).assignDepartment("Finance");

        employees.add(fte);
        employees.add(pte);

        // Process and display employee details using polymorphism
        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("Total Salary: " + emp.calculateSalary());
            System.out.println(((Department) emp).getDepartmentDetails());
            System.out.println();
        }
    }
}
