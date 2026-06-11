// Base class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Derived class from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Derived class from Dog
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping");
    }
}

// Main class
public class MultilevelInheritanceDemo {
    public static void main(String[] args) {

        Puppy p = new Puppy();

        // Method from Animal class
        p.eat();

        // Method from Dog class
        p.bark();

        // Method from Puppy class
        p.weep();
    }
}