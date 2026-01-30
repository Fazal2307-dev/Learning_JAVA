//Write a Java program to create a new string after removing a specified character from
// a given string. This is except the first and last position.
import java.util.*;

// Define a class named Main
public class Problem_96{

    // Method to remove all occurrences of 'z' from the string
    public String removeAllZ(String stng) {
        String fin_str = ""; // Initialize an empty string to store the modified string
        int l = stng.length(); // Get the length of the given string

        // Loop through each character of the string
        for (int i = 0; i < l; i++) {
            char temp = stng.charAt(i); // Get the character at the current index

            // Check if the character is not 'z' or if it's the first or last character in the string
            if (!(i > 0 && i < l - 1 && temp == 'z')) {
                fin_str = fin_str + temp; // Append the character to the final string
            }
        }
        return fin_str; // Return the modified string with 'z' removed
    }

    // Main method to execute the program
    public static void main(String[] args) {
        Problem_96 m = new Problem_96(); // Create an instance of the Main class

        String str1 = "zebrazone"; // Given string
        // Display the given string and the new string after removing 'z'
        System.out.println("The given string is: " + str1);
        System.out.println("The new string is: " + m.removeAllZ(str1));
    }
}