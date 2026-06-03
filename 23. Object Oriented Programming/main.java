class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Error: Age cannot be negative. Setting age to 0.");
            this.age = 0;
        }
    }
}

public class main {
    public static void main(String[] args) {
        Person person = new Person("Alice", 25);

        System.out.println("--- Initial State ---");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        System.out.println("\n--- Updating Data ---");
        person.setName("Bob");
        person.setAge(30);
        
        System.out.println("Updated Name: " + person.getName());
        System.out.println("Updated Age: " + person.getAge());

        System.out.println("\n--- Testing Setter Validation ---");
        person.setAge(-5); 
        
        System.out.println("Final Age: " + person.getAge());
    }
}