package Day02_Java.Level1_Class_and_Object;

public class Person {

    // Attributes
    private String name;
    private int age;
    private String address;

    // Default constructor
    public Person() {
    }

    // Parameterized constructor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Copy constructor
    public Person(Person otherPerson) {
        this.name = otherPerson.name;
        this.age = otherPerson.age;
        this.address = otherPerson.address;
    }

    // Getter and Setter methods
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Method to display person information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        // Create a person using parameterized constructor
        Person person1 = new Person("John Doe", 30, "123 Main St");

        // Create a person using the copy constructor
        Person person2 = new Person(person1);

        // Display information of both persons
        System.out.println("Person 1 Information:");
        person1.displayInfo();

        System.out.println("\nPerson 2 Information (Copy):");
        person2.displayInfo();
    }
}
