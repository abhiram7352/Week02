package Day02_Java.Level1_Class_and_Object;

public class Employee {
    // Public instance variable
    public int employeeID;

    // Protected instance variable
    protected String department;

    // Private instance variable
    private double salary;

    // Constructor to initialize employee details
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to get salary
    public double getSalary() {
        return salary;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

// Subclass to demonstrate access to employeeID and department
class Manager extends Employee {
    private String teamName;

    // Constructor to initialize manager details
    public Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }

    // Method to display manager details
    public void displayManagerDetails() {
        System.out.println("Employee ID: " + employeeID); // Access public member
        System.out.println("Department: " + department); // Access protected member
        System.out.println("Team Name: " + teamName);
    }

    public static void main(String[] args) {
        Employee employee = new Employee(101, "Engineering", 75000);
        employee.displayEmployeeDetails();

        // Modify salary
        employee.setSalary(80000);
        System.out.println("Updated Salary: " + employee.getSalary());

        Manager manager = new Manager(102, "Marketing", 90000, "Product Team");
        manager.displayManagerDetails();
    }
}
