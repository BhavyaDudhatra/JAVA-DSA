import java.util.Scanner;

public class OnesComplement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = sc.nextLine();

        StringBuilder onesComplement = new StringBuilder();

        for (int i = 0; i < binary.length(); i++) {
            char bit = binary.charAt(i);

            if (bit == '0') {
                onesComplement.append('1');
            } else if (bit == '1') {
                onesComplement.append('0');
            } else {
                System.out.println("Invalid binary input!");
                return;
            }
        }

        System.out.println("1's Complement: " + onesComplement.toString());
        sc.close();
    }
}