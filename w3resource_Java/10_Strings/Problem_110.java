//Write a Java program to count the number of characters (alphanumeric only) that
// occur more than twice in a given string.
public class Problem_110 {
    public static void main(String[] args) {
        // Define a string 'text' with certain characters
        String text = "abcdaa";
        System.out.println("Original String: " + text); // Display the original string

        // Count and display the number of duplicate characters occurring more than twice in the string
        System.out.println("Number of duplicate characters in the said String (Occurs more than twice.): " + test(text));

        // Change the value of 'text' to another string
        text = "Tergiversation";
        System.out.println("\nOriginal String: " + text); // Display the original string

        // Count and display the number of duplicate characters occurring more than twice in the string
        System.out.println("Number of duplicate characters in the said String (Occurs more than twice.): " + test(text));
    }

    // Method to count duplicate characters occurring more than twice in a string
    public static int test(String text) {
        int ctr = 0; // Counter to store the count of duplicate characters

        // Continue looping until the length of 'text' becomes zero
        while (text.length() > 0) {
            // Check if the count of a character (after removal) is more than 2 in the string
            if (text.length() - text.replaceAll(text.charAt(0) + "", "").length() > 2) {
                ctr++; // Increment the counter if duplicate characters are found more than twice
            }

            // Remove all occurrences of the first character from the string 'text'
            text = text.replaceAll(text.charAt(0) + "", "");
        }

        return ctr; // Return the count of duplicate characters occurring more than twice
    }
}