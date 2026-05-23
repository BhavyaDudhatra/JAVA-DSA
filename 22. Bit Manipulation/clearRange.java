public class clearRange {
    public static int clearBitsInRange(int n, int i, int j) {

        // Create mask with 1s before j and after i
        int a = (~0) << (j + 1);
        int b = (1 << i) - 1;

        int mask = a | b;

        return n & mask;
    }
    public static void main(String[] args) {

        int n = 255; // 11111111
        int result = clearBitsInRange(n, 2, 5);

        System.out.println(result); // 195
        System.out.println(Integer.toBinaryString(result)); // 11000011
    }
}