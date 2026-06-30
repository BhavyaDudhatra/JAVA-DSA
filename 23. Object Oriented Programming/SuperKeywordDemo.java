// Parent class
class Animal {
    String color = "White";

    Animal() {
        System.out.println("Animal constructor called");
    }

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {
    String color = "Black";

    Dog() {
        super(); // Calls parent class constructor
        System.out.println("Dog constructor called");
    }

    void display() {
        System.out.println("Child color: " + color);
        System.out.println("Parent color: " + super.color); // Access parent variable
    }

    void sound() {
        super.sound(); // Call parent method
        System.out.println("Dog barks");
    }
}

// Main class
public class SuperKeywordDemo {
    public static void main(String[] args) {
        Dog d = new Dog();

        System.out.println();
        d.display();

        System.out.println();
        d.sound();
    }
}