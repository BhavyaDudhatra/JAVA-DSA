public class construction {
    String name;
    int age;

    construction(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        construction s1 = new construction("Rahul", 20);
        s1.display();
    }
}