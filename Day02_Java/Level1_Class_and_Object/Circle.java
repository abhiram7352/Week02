package Day02_Java.Level1_Class_and_Object;

public class Circle {
    //Attribute
    private double radius;

    //default constructor
    Circle(){
        this(1);
    }

    //parameterized constructor
    Circle(int radius){
        this.radius=radius;
    }

    //Getter for radius
    public double getRadius() {
        return radius;
    }
    //Setter for radius
    public void setRadius(double radius){
        this.radius = radius;
    }

    //Method to calculate circumference of the circle
    public double calculateArea(){
        return Math.PI*radius*radius;
    }

    public double calculateCircuference(){
        return 2*Math.PI*radius;
    }

    public static void main(String[] args ){
        Circle defaultCircle = new Circle();
        System.out.println("Default Circle Radius: "+ defaultCircle.getRadius());
        System.out.println("Default Circle Area: " + defaultCircle.calculateArea());
        System.out.println("Default Circle Circumference: " + defaultCircle.calculateCircuference());
    }
}

