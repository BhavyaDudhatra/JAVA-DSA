import java.util.Scanner;

public class Main {

    // Recursive function to print numbers from 1 to n
    static void printIncreasing(int n) {
        if (n == 0) {
            return;
        }

        printIncreasing(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        printIncreasing(n);

        sc.close();
    }
}