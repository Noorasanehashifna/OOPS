public class StringManipulation {
    public static void main(String[] args) {

        String str = "Hello World";

        int length = str.length();
        System.out.println("Length: " + length);

        String uppercase = str.toUpperCase();   // ✅ fixed
        System.out.println("Uppercase: " + uppercase);

        String lowercase = str.toLowerCase();
        System.out.println("Lowercase: " + lowercase);

        String substring = str.substring(6, 11);  // ✅ corrected index
        System.out.println("Substring: " + substring);

        boolean startsWith = str.startsWith("Hello");
        System.out.println("Starts with 'Hello': " + startsWith);

        boolean endsWith = str.endsWith("World");
        System.out.println("Ends with 'World': " + endsWith);

        String trimmed = "   Hello, World   ".trim();   // better example
        System.out.println("Trimmed: " + trimmed);
    }
}
