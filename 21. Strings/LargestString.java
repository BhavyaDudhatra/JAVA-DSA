import java.util.Scanner;

public class LargestString{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for number of strings
        System.out.print("Enter number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        String[] arr = new String[n];

        // Input strings
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLine();
        }

        // Assume first string is the largest
        String largest = arr[0];

        // Compare lengths
        for (int i = 1; i < n; i++) {
            if (arr[i].length() > largest.length()) {
                largest = arr[i];
            }
        }

        // Output result
        System.out.println("Largest string is: " + largest);

        scanner.close();
    }
}