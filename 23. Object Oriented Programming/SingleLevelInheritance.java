// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class inheriting Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Main class
public class SingleLevelInheritance {
    public static void main(String[] args) {

        // Creating object of child class
        Dog d = new Dog();

        // Calling inherited method
        d.eat();

        // Calling child class method
        d.bark();
    }
}