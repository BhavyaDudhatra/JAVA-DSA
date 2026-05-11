import java.util.Scanner;

public class GetIthBit {

    // Function to get ith bit
    public static int getIthBit(int num, int i) {

        // Create bitmask
        int bitMask = 1 << i;

        // Check bit using AND operator
        if ((num & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        System.out.print("Enter bit position (i): ");
        int i = sc.nextInt();

        int bit = getIthBit(num, i);

        System.out.println("The " + i + "th bit is: " + bit);

        sc.close();
    }
}