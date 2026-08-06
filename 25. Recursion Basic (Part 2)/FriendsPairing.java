import java.util.Scanner;

public class FriendsPairing {

    // Recursive function
    public static int friendsPairing(int n) {
        // Base cases
        if (n == 0 || n == 1) {
            return 1;
        }

        // One friend stays single
        int single = friendsPairing(n - 1);

        // One friend pairs with any of the remaining friends
        int pair = (n - 1) * friendsPairing(n - 2);

        // Total ways
        return single + pair;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of friends: ");
        int n = sc.nextInt();

        System.out.println("Total ways = " + friendsPairing(n));

        sc.close();
    }
}