class Student {
    int id;
    String name;

    // Parameterized constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Copy constructor
    Student(Student s) {
        this.id = s.id;
        this.name = s.name;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class CopyConstructor {
    public static void main(String[] args) {

        // Original object
        Student s1 = new Student(101, "Rahul");

        // Copy object
        Student s2 = new Student(s1);

        System.out.println("Original Object:");
        s1.display();

        System.out.println("Copied Object:");
        s2.display();
    }
}