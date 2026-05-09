public class RightShiftExample {

    public static void main(String[] args) {

        int number = 16;

        // Binary Right Shift by 1
        int result1 = number >> 1;

        // Binary Right Shift by 2
        int result2 = number >> 2;

        System.out.println("Original Number : " + number);
        System.out.println("Binary of Original Number : " + Integer.toBinaryString(number));

        System.out.println("\nAfter Right Shift by 1:");
        System.out.println("Result : " + result1);
        System.out.println("Binary : " + Integer.toBinaryString(result1));

        System.out.println("\nAfter Right Shift by 2:");
        System.out.println("Result : " + result2);
        System.out.println("Binary : " + Integer.toBinaryString(result2));
    }
}