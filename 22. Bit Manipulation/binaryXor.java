public class binaryXor {
    public static void main(String[] args) {
        int a = 5;   // binary: 0101
        int b = 3;   // binary: 0011

        int result = a ^ b; // XOR operation

        System.out.println("a = " + a + " (" + Integer.toBinaryString(a) + ")");
        System.out.println("b = " + b + " (" + Integer.toBinaryString(b) + ")");
        System.out.println("XOR result = " + result + " (" + Integer.toBinaryString(result) + ")");
    }
}