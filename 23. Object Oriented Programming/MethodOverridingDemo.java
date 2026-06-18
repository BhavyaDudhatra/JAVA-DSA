// Parent class
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {

    // Overriding the parent class method
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Main class
public class MethodOverridingDemo {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.makeSound();

        Dog dog = new Dog();
        dog.makeSound();

        // Runtime Polymorphism
        Animal obj = new Dog();
        obj.makeSound();
    }
}