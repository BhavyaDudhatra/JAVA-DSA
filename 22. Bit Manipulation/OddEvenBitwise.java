import java.util.Scanner;

public class OddEvenBitwise {

    // Method to check odd or even using bit manipulation
    public static void checkOddEven(int number) {

        // If last bit is 0 -> Even
        // If last bit is 1 -> Odd
        if ((number & 1) == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        checkOddEven(num);

        sc.close();
    }
}