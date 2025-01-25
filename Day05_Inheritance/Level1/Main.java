package Day05_Inheritance.Level1;

class Animal {
    //Attributes
    String name;
    int age;

    void makeSound() {
        System.out.println("General Sound...");
    }
}
   //Subclass representing Dog
    class Dog extends Animal {
        @Override
        void makeSound() {
            System.out.println("Bark Bark Bark...");
        }
    }

   //Subclass representing Cat
    class Cat extends Animal {
       @Override
        void makeSound() {
            System.out.println("Meow Meow Meow...");
        }
    }
    //Subclass representing Bird
    class Bird extends Animal {
    @Override
        void makeSound() {
            System.out.println("Chirping Chirping...");
        }
    }

 //Main method demonstrating concept of polymophism
 public class Main{
    public static void main(String[] args) {

        //Animal reference pointing to Dog object
        Animal dog = new Dog();
        dog.makeSound();

        //Animal reference pointing to Cat object
        Animal cat = new Cat();
        cat.makeSound();;

        //Animal reference pointing to Bird object
        Animal bird = new Bird();
        bird.makeSound();

    }
}