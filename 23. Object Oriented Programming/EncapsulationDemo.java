// Encapsulated class
class Student {
    // Private data members
    private String name;
    private int age;

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) { // validation
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// Main class
public class EncapsulationDemo {
    public static void main(String[] args) {
        Student student = new Student();

        // Setting values using setters
        student.setName("Rahul");
        student.setAge(20);

        // Accessing values using getters
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }
}