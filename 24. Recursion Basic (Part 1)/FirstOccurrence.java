public class FirstOccurrence {

    // Recursive function to find the first occurrence
    public static int firstOccurrence(int[] arr, int index, int key) {
        // Base case: reached end of array
        if (index == arr.length) {
            return -1;
        }

        // If current element matches the key
        if (arr[index] == key) {
            return index;
        }

        // Recursive call for the next index
        return firstOccurrence(arr, index + 1, key);
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 3, 9, 3};
        int key = 3;

        int result = firstOccurrence(arr, 0, key);

        if (result != -1) {
            System.out.println("First occurrence of " + key + " is at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}