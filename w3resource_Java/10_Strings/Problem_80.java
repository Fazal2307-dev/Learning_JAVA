//Write a Java program to check whether the character immediately before and after a
// specified character is the same in a given string.
import java.util.*;

// Define a class named Main
public class Problem_80{

    // Method to check if characters before and after '#' are the same
    public boolean leftAndRightSame(String stng) {
        int l = stng.length(); // Get the length of the given string 'stng'
        boolean found = true; // Initialize a boolean variable 'found' as true

        // Loop through each character in the given string 'stng'
        for (int i = 0; i < l; i++) {
            String tmpString = stng.substring(i, i + 1); // Extract each character of 'stng' individually

            // Check if the character is '#', and it's not the first or last character
            if (tmpString.equals("#") && i > 0 && i < l - 1) {
                // Check if the character before '#' is equal to the character after '#'
                if (stng.charAt(i - 1) == stng.charAt(i + 1)) {
                    found = true; // Set 'found' to true if characters before and after '#' are the same
                } else {
                    found = false; // Set 'found' to false if characters before and after '#' are different
                }
            }
        }
        return found; // Return the result whether characters before and after '#' are the same or not
    }

    // Main method to execute the program
    public static void main(String[] args) {
        Problem_80 m = new Problem_80(); // Create an instance of the Main class

        String str1 = "moon#night"; // Given string

        // Display the given string and the result of checking characters before and after '#'
        System.out.println("The given string is: " + str1);
        System.out.println("The before and after character are same: " + m.leftAndRightSame(str1));
    }
}