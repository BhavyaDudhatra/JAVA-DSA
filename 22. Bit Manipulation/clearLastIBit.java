public class clearLastIBit {
    public static void main(String[] args) {
        int n = 29; // 11101 in binary
        int i = 3;

        int result = n & (~0 << i);

        System.out.println("Original number: " + n);
        System.out.println("After clearing last " + i + " bits: " + result);
    }
}