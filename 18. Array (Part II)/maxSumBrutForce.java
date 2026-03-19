public class maxSumBrutForce {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int arr[] = {1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;  // FIXED

                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }

                if (sum > max) {
                    max = sum;
                }
            }
        }

        System.out.println(max);
    }
}