public class SetIthBit {
    public static void main(String[] args) {
        int num = 10; // Binary: 1010
        int i = 2;

        int result = num | (1 << i);

        System.out.println("Result: " + result);
    }
}