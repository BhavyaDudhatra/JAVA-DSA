public class updateIthBit {
    public static int updateBit(int num, int i, int bit) {
        // Clear the i-th bit
        num = num & ~(1 << i);

        // Set new bit value
        num = num | (bit << i);

        return num;
    }

    public static void main(String[] args) {
        int num = 10; // 1010
        int i = 1;
        int bit = 1;

        int result = updateBit(num, i, bit);

        System.out.println("Updated Number: " + result);
    }
}