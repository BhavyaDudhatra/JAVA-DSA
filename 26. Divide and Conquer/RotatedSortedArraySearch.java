import java.util.Scanner;

public class RotatedSortedArraySearch {

    // Recursive divide-and-conquer search
    public static int search(int[] arr, int left, int right, int target) {

        // Base case: element not found
        if (left > right) {
            return -1;
        }

        // Find middle
        int mid = left + (right - left) / 2;

        // Target found
        if (arr[mid] == target) {
            return mid;
        }

        // Check if left half is sorted
        if (arr[left] <= arr[mid]) {

            // Target lies in the sorted left half
            if (target >= arr[left] && target < arr[mid]) {
                return search(arr, left, mid - 1, target);
            }

            // Search in right half
            return search(arr, mid + 1, right, target);
        }

        // Otherwise, right half is sorted
        else {

            // Target lies in the sorted right half
            if (target > arr[mid] && target <= arr[right]) {
                return search(arr, mid + 1, right, target);
            }

            // Search in left half
            return search(arr, left, mid - 1, target);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array
        System.out.println("Enter elements of the sorted and rotated array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input target
        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        // Perform search
        int index = search(arr, 0, n - 1, target);

        // Display result
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }

        sc.close();
    }
}