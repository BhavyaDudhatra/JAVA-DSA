// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class 1
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Child class 2
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

// Main class
public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {

        // Creating Dog object
        Dog d = new Dog();
        d.eat();   // inherited method
        d.bark();  // own method

        System.out.println();

        // Creating Cat object
        Cat c = new Cat();
        c.eat();   // inherited method
        c.meow();  // own method
    }
}
