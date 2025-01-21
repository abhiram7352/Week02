package Day03_Keyword_Practice_Problem.Level1;

public class Employee {

    //Make companyName static to share static variable among all employee
    static String companyName = "Capgemini";

    String name;
    final String id;
    String designation;
    static int totalEmployees=0;  // To keep count of total number of employees in capgemini
    //Static method to display Total Employees

    //Constructor using 'this' keyword
    Employee(String name, String id, String designation){
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }


    static void  displayTotalEmployees(){
        System.out.println("Total Employees: "+ totalEmployees);
    }
    //method to display details
     void displayDetails(){
        if(this instanceof Employee){
            System.out.println("Company Name: "+ companyName);
            System.out.println("Employee name: "+ name);
            System.out.println("Employee ID: "+ id);
            System.out.println("Designation: "+ designation);


        }else{
            System.out.println("Invalid object");
        }
    }

    public static void main(String[] args) {

        // Create a employee1 object
        Employee employee1 = new Employee("Abhiram", "01AK2024", "Manager");
        // Create a employee2 object
        Employee employee2 = new Employee("Rahul", "01AK2025", "Secrutiy");

        //Display Employees details
        employee1.displayDetails();

        System.out.println();
        //Display Employees details
        employee2.displayDetails();

        System.out.println();
        //Displaying company name using static method
        Employee.displayTotalEmployees();

    }
}
