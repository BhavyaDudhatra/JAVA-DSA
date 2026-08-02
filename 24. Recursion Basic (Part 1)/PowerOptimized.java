import java.util.Scanner;

public class PowerOptimized {

    // Function to calculate x^n using optimized recursion
    public static long power(long x, long n) {
        // Base case
        if (n == 0) {
            return 1;
        }

        // Recursive call
        long halfPower = power(x, n / 2);

        // If exponent is even
        if (n % 2 == 0) {
            return halfPower * halfPower;
        }
        // If exponent is odd
        else {
            return x * halfPower * halfPower;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base (x): ");
        long x = sc.nextLong();

        System.out.print("Enter exponent (n): ");
        long n = sc.nextLong();

        System.out.println(x + "^" + n + " = " + power(x, n));

        sc.close();
    }
}