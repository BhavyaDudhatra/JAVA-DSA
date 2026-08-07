import java.util.Scanner;

public class BinaryStrings {

    // Recursive function to generate binary strings
    static void generateBinaryStrings(int n, String str) {
        // Base case
        if (str.length() == n) {
            System.out.println(str);
            return;
        }

        // Add '0'
        generateBinaryStrings(n, str + "0");

        // Add '1'
        generateBinaryStrings(n, str + "1");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of binary string: ");
        int n = sc.nextInt();

        generateBinaryStrings(n, "");

        sc.close();
    }
}