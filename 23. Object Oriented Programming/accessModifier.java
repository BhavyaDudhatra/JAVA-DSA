class PrivateExample {
    private int age = 25;

    private void displayAge() {
        System.out.println("Age: " + age);
    }

    public void show() {
        displayAge(); // allowed
    }
}

public class accessModifier {
    public static void main(String[] args) {
        PrivateExample obj = new PrivateExample();

        // obj.age = 30;        // ERROR
        // obj.displayAge();    // ERROR

        obj.show();
    }
}