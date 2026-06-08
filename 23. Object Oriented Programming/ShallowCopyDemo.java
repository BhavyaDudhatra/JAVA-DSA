class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Employee implements Cloneable {
    int id;
    String name;
    Address address;

    Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Shallow copy
    }
}

public class ShallowCopyDemo {
    public static void main(String[] args) throws CloneNotSupportedException {

        Address addr = new Address("Ahmedabad");

        Employee emp1 = new Employee(101, "Rahul", addr);

        Employee emp2 = (Employee) emp1.clone();

        System.out.println("Before modification:");
        System.out.println("Emp1 City: " + emp1.address.city);
        System.out.println("Emp2 City: " + emp2.address.city);

        // Change city through copied object
        emp2.address.city = "Surat";

        System.out.println("\nAfter modification:");
        System.out.println("Emp1 City: " + emp1.address.city);
        System.out.println("Emp2 City: " + emp2.address.city);
    }
}