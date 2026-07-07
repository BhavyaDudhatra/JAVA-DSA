import java.util.Scanner;

public class FactorialRecursion {

    // Recursive method to calculate factorial
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check for negative numbers
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long result = factorial(n);
            System.out.println("Factorial of " + n + " is: " + result);
        }

        sc.close();
    }
}