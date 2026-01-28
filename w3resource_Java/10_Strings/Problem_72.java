//Write a Java program to return true if a given string contains the string 'pop',
// but the middle 'o' also may contain another character.
import java.util.*;

// Define a class named Main
public class Problem_72{

    // Method to check if "p?p" pattern appears in the given string
    public boolean popInTheString(String stng) {
        int len = stng.length(); // Get the length of the input string

        // Iterate through the string up to the third-to-last character
        for (int i = 0; i < len - 2; i++) {
            // Check if the current character is 'p' and the character two positions ahead is also 'p'
            if (stng.charAt(i) == 'p' && stng.charAt(i + 2) == 'p') {
                return true; // Return true if "p?p" pattern is found
            }
        }
        return false; // Return false if the pattern is not found in the string
    }

    // Main method to execute the program
    public static void main(String[] args) {
        Problem_72 m = new Problem_72(); // Create an instance of the Main class

        String str1 = "dikchapop"; // Input string to be checked

        // Display the given string and check if "p?p" pattern appears in the string using popInTheString method
        System.out.println("The given string is: " + str1);
        System.out.println("Does 'p?p' appear in the given string? " + m.popInTheString(str1));
    }
}