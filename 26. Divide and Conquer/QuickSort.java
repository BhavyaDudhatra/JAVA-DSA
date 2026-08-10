import java.util.Scanner;

public class QuickSort {

    // Quick Sort function
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {

            // Find the partition index
            int pivotIndex = partition(arr, low, high);

            // Divide: Sort left part
            quickSort(arr, low, pivotIndex - 1);

            // Divide: Sort right part
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Partition function
    static int partition(int[] arr, int low, int high) {

        // Choose the last element as pivot
        int pivot = arr[high];

        int i = low - 1;

        // Place elements smaller than pivot on the left
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot in its correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Display array
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array before sorting:");
        printArray(arr);

        // Call Quick Sort
        quickSort(arr, 0, n - 1);

        System.out.println("Array after sorting:");
        printArray(arr);

        sc.close();
    }
}