// Interface 1
interface A {
    void displayA();
}

// Interface 2
interface B {
    void displayB();
}

// Parent class
class C {
    void displayC() {
        System.out.println("Class C Method");
    }
}

// Child class inherits C and implements A, B
class D extends C implements A, B {

    public void displayA() {
        System.out.println("Interface A Method");
    }

    public void displayB() {
        System.out.println("Interface B Method");
    }

    void displayD() {
        System.out.println("Class D Method");
    }
}

// Main class
public class HybridInheritanceDemo {
    public static void main(String[] args) {

        D obj = new D();

        obj.displayA();
        obj.displayB();
        obj.displayC();
        obj.displayD();
    }
}