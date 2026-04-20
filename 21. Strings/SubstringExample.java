public class SubstringExample {
    public static void main(String[] args) {
        String str = "Hello World";

        // Example 1: substring with one parameter
        String part1 = str.substring(6);

        // Example 2: substring with two parameters
        String part2 = str.substring(0, 5);

        // Example 3: extracting domain from email
        String email = "user@gmail.com";
        String domain = email.substring(email.indexOf("@") + 1);

        // Printing results
        System.out.println("Original String: " + str);
        System.out.println("Substring (6): " + part1);
        System.out.println("Substring (0,5): " + part2);
        System.out.println("Email Domain: " + domain);
    }
}