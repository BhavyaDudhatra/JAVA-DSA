import java.util.Scanner;

public class CheckSorted {

    // Recursive function to check if array is sorted
    static boolean isSorted(int[] arr, int index) {
        // Base case: if we reach the last element
        if (index == arr.length - 1) {
            return true;
        }

        // If current element is greater than next, array is not sorted
        if (arr[index] > arr[index + 1]) {
            return false;
        }

        // Check the remaining array
        return isSorted(arr, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Check if array is sorted
        if (n == 0 || isSorted(arr, 0)) {
            System.out.println("Array is sorted.");
        } else {
            System.out.println("Array is not sorted.");
        }

        sc.close();
    }
}