// Abstract class
abstract class Animal {

    // Abstract method (no body)
    abstract void makeSound();

    // Concrete method
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Subclass
class Dog extends Animal {

    // Implement abstract method
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Main class
public class AbstractClassDemo {
    public static void main(String[] args) {

        // Animal a = new Animal(); // Error: Cannot instantiate abstract class

        Dog dog = new Dog();
        dog.makeSound();
        dog.sleep();
    }
}