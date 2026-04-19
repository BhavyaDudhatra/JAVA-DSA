public class stringCompare {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "hello";
        String str4 = new String("Hello");

        // 1. equals() - case-sensitive comparison
        System.out.println("equals():");
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // false

        // 2. equalsIgnoreCase() - ignores case
        System.out.println("\nequalsIgnoreCase():");
        System.out.println("str1.equalsIgnoreCase(str3): " + str1.equalsIgnoreCase(str3)); // true

        // 3. compareTo() - lexicographical comparison
        System.out.println("\ncompareTo():");
        System.out.println("str1.compareTo(str2): " + str1.compareTo(str2)); // 0
        System.out.println("str1.compareTo(str3): " + str1.compareTo(str3)); // negative
        System.out.println("str3.compareTo(str1): " + str3.compareTo(str1)); // positive

        // 4. compareToIgnoreCase() - ignores case
        System.out.println("\ncompareToIgnoreCase():");
        System.out.println("str1.compareToIgnoreCase(str3): " + str1.compareToIgnoreCase(str3)); // 0

        // 5. == operator - compares references
        System.out.println("\n== operator:");
        System.out.println("str1 == str2: " + (str1 == str2)); // true (same literal pool)
        System.out.println("str1 == str4: " + (str1 == str4)); // false (different objects)

        // 6. Extra example with ordering
        String a = "Apple";
        String b = "Banana";

        System.out.println("\nLexicographical order example:");
        if (a.compareTo(b) < 0) {
            System.out.println(a + " comes before " + b);
        } else if (a.compareTo(b) > 0) {
            System.out.println(a + " comes after " + b);
        } else {
            System.out.println("Both strings are equal");
        }
    }
}