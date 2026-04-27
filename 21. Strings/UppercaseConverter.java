import java.util.Scanner;

public class UppercaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert to uppercase
        String upperCaseString = input.toUpperCase();

        // Display result
        System.out.println("Uppercase string: " + upperCaseString);

        scanner.close();
    }
}