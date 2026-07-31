public class LastOccurrenceRecursion {

    // Recursive function to find the last occurrence
    public static int lastOccurrence(int[] arr, int index, int target) {
        // Base case
        if (index == arr.length) {
            return -1;
        }

        // Search in the remaining array
        int ans = lastOccurrence(arr, index + 1, target);

        // If found later, return that index
        if (ans != -1) {
            return ans;
        }

        // Otherwise, check the current index
        if (arr[index] == target) {
            return index;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 2, 9, 2, 4};
        int target = 2;

        int result = lastOccurrence(arr, 0, target);

        if (result != -1) {
            System.out.println("Last occurrence of " + target + " is at index: " + result);
        } else {
            System.out.println(target + " not found in the array.");
        }
    }
}