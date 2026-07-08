import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Recursive method to calculate the sum
    static int sum(int n) {
        if (n == 0) {
            return 0; // Base case
        }
        return n + sum(n - 1); // Recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Calculate and display the sum
        int result = sum(n);
        System.out.println("Sum of first " + n + " natural numbers = " + result);

        sc.close();
    }
}