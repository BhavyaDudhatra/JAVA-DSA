public class TilingProblem {

    public static int tilingWays(int n) {
        // Base cases
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive calls
        int vertical = tilingWays(n - 1);
        int horizontal = tilingWays(n - 2);

        return vertical + horizontal;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("Number of ways = " + tilingWays(n));
    }
}