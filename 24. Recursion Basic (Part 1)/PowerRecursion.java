import java.util.Scanner;

public class PowerRecursion {

    // Recursive function to calculate x^n
    public static int power(int x, int n) {
        // Base case
        if (n == 0) {
            return 1;
        }

        // Recursive case
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base (x): ");
        int x = sc.nextInt();

        System.out.print("Enter the exponent (n): ");
        int n = sc.nextInt();

        int result = power(x, n);

        System.out.println(x + "^" + n + " = " + result);

        sc.close();
    }
}