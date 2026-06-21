// Abstract class
abstract class Vehicle {

    // Abstract method (no body)
    abstract void start();

    // Concrete method
    void stop() {
        System.out.println("Vehicle stopped.");
    }
}

// Subclass
class Car extends Vehicle {

    // Implement abstract method
    @Override
    void start() {
        System.out.println("Car starts with a key.");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {

        // Reference of abstract class
        Vehicle v = new Car();

        v.start();
        v.stop();
    }
}