public class QuickSortWorstCase {

    // Quick Sort function
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {

            // Divide: partition the array
            int pivotIndex = partition(arr, low, high);

            // Conquer: sort elements before pivot
            quickSort(arr, low, pivotIndex - 1);

            // Conquer: sort elements after pivot
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Partition function
    static int partition(int[] arr, int low, int high) {

        // Choose the last element as pivot
        int pivot = arr[high];

        int i = low - 1;

        for (int j = low; j < high; j++) {

            // If current element is smaller than pivot
            if (arr[j] < pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Put pivot in its correct position
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

    public static void main(String[] args) {

        // Already sorted array -> Worst Case
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("Array before sorting:");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Array after sorting:");
        printArray(arr);
    }
}