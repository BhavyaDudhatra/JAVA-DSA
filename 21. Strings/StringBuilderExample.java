public class StringBuilderExample {
    public static void main(String[] args) {

        // Create StringBuilder
        StringBuilder sb = new StringBuilder("Hello");

        // Append (add text)
        sb.append(" World");
        System.out.println("After append: " + sb);

        // Insert text at specific position
        sb.insert(5, ",");
        System.out.println("After insert: " + sb);

        // Replace characters
        sb.replace(6, 11, "Java");
        System.out.println("After replace: " + sb);

        // Delete characters
        sb.delete(5, 6);
        System.out.println("After delete: " + sb);

        // Reverse string
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // Length of string
        System.out.println("Length: " + sb.length());

        // Capacity of StringBuilder
        System.out.println("Capacity: " + sb.capacity());

        // Convert to String
        String finalString = sb.toString();
        System.out.println("Final String: " + finalString);
    }
}