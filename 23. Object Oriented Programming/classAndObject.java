// public class classAndObject {
    
// }
// Class definition
class Student {
    // Instance variables (attributes)
    String name;
    int age;

    // Method
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class classAndObject {
    public static void main(String[] args) {
        
        // Creating first object
        Student student1 = new Student();
        student1.name = "Rahul";
        student1.age = 20;

        // Creating second object
        Student student2 = new Student();
        student2.name = "Priya";
        student2.age = 22;

        // Calling methods using objects
        student1.displayInfo();
        System.out.println();

        student2.displayInfo();
    }
}