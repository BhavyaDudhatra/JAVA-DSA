public class FastExponentiation {

    public static long power(long base, long exp) {
        long result = 1;

        while (exp > 0) {
            // If the least significant bit is 1
            if ((exp & 1) == 1) {
                result *= base;
            }

            base *= base;  // Square the base
            exp >>= 1;     // Divide exponent by 2
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(power(2, 10)); // 1024
        System.out.println(power(3, 5));  // 243
    }
}