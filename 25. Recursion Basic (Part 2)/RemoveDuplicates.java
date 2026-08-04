public class RemoveDuplicates {

    // Array to keep track of visited characters (a-z)
    static boolean[] map = new boolean[26];

    public static void removeDuplicates(String str, int idx, StringBuilder newStr) {
        // Base case
        if (idx == str.length()) {
            System.out.println("String after removing duplicates: " + newStr);
            return;
        }

        char currChar = str.charAt(idx);

        // If character already exists, skip it
        if (map[currChar - 'a']) {
            removeDuplicates(str, idx + 1, newStr);
        } else {
            // Mark character as visited
            map[currChar - 'a'] = true;
            newStr.append(currChar);
            removeDuplicates(str, idx + 1, newStr);
        }
    }

    public static void main(String[] args) {
        String str = "appnnacollege";

        removeDuplicates(str, 0, new StringBuilder());
    }
}