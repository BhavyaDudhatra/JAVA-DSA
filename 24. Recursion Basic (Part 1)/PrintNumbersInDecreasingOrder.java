import java.util.Scanner;

public class PrintNumbersInDecreasingOrder {

    // Recursive function
    static void printDecreasing(int n) {
        if (n == 0) {   // Base case
            return;
        }

        System.out.print(n + " ");
        printDecreasing(n - 1);   // Recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        printDecreasing(n);
    }
}