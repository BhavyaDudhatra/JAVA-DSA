// Interface
interface Animal {
    void makeSound(); // abstract method
}

// Implementing class
class Dog implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

// Main class
public class InterfaceDemo {
    public static void main(String[] args) {

        Animal animal = new Dog();
        animal.makeSound();
    }
}