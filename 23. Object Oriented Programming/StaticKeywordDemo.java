class Student {

    // Static variable (shared by all objects)
    static String college = "ABC College";

    // Instance variables
    String name;
    int rollNo;

    // Static block (runs once when class is loaded)
    static {
        System.out.println("Static block executed");
    }

    // Constructor
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Static method
    static void showCollege() {
        System.out.println("College: " + college);
    }

    // Instance method
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("College: " + college);
        System.out.println();
    }
}

public class StaticKeywordDemo {

    public static void main(String[] args) {

        // Calling static method without creating object
        Student.showCollege();

        // Creating objects
        Student s1 = new Student("Rahul", 101);
        Student s2 = new Student("Priya", 102);

        // Display details
        s1.display();
        s2.display();

        // Changing static variable
        Student.college = "XYZ University";

        System.out.println("After changing static variable:\n");

        s1.display();
        s2.display();
    }
}