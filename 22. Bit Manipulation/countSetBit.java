import java.util.Scanner;
public class countSetBit {

    // Function to count set bits
    public static int countSetBits(int n) {
        int count = 0;

        while (n != 0) {
            n = n & (n - 1); // removes the rightmost set bit
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = countSetBits(num);

        System.out.println("Number of set bits: " + result);

        sc.close();
    }
}