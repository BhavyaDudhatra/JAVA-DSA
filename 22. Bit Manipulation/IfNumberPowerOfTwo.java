import java.util.Scanner;

public class IfNumberPowerOfTwo {

    // Function to check power of 2
    static boolean isPowerOfTwo(int n) {

        // Power of 2 must be positive
        if (n <= 0) {
            return false;
        }

        // Bit manipulation check
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPowerOfTwo(num)) {
            System.out.println(num + " is a Power of 2");
        } else {
            System.out.println(num + " is NOT a Power of 2");
        }

        sc.close();
    }
}