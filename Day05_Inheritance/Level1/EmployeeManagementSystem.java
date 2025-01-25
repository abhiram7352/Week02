package Day05_Inheritance.Level1;

class Employee {
    //Attributes;
    String name;
    int id;
    int salary;

    //Creating
    Employee(String name, int id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    //method to display details
    void displayDetails(){
        System.out.println( "name: "+ name);
        System.out.println("ID: "+ id);
        System.out.println("and his salary: "+ salary);
    }

}
class Manager extends Employee{
    //Attribues
    int teamSize;
    Manager(String name, int id, int salary, int teamSize){
        super(name, id , salary);
        this.teamSize=teamSize;
    }
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team size: " + teamSize);
    }


}

class Developer extends  Employee{

    //Attribues
    String programmingLanguage;
    Developer(String name, int id, int salary, String programmingLanguage){
        super(name, id, salary);
        this.programmingLanguage=programmingLanguage;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }

}

class Intern extends Employee{
    String school;
    Intern(String name, int id, int salary, String school){
        super (name, id, salary);
        this.school=school;

    }
    void displayDetails() {
        super.displayDetails();
        System.out.println("School name: " + school);
    }

}

public class EmployeeManagementSystem{
    public static void main(String[] args) {
        Manager manager = new Manager("Abhiram", 1002, 30000, 8);
        Developer developer = new Developer("Hritk", 100, 1000, "Java");
        Intern intern = new Intern("Rahul", 10, 5000, "Kinder Garden");

        System.out.println("Manager Details: ");
        manager.displayDetails();

        System.out.println();
        System.out.println("Developer Details: ");
        developer.displayDetails();

        System.out.println();
        System.out.println("Intern Details: ");
        intern.displayDetails();
    }
}
