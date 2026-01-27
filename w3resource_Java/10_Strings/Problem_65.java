//Write a Java program to read a given string and return the string without the first
// or last characters if they are the same, otherwise return the string without the
// characters.
import java.util.*;

// Define a class named Main
public class Problem_65 {

    // Method to exclude 't' character from the string based on certain conditions
    public String excludeT(String stng) {
        // If the length of the input string is 0, return the input string
        if (stng.length() == 0)
            return stng;

        // If the length of the input string is 1
        if (stng.length() == 1) {
            // If the string contains 't', return an empty string; otherwise, return the string itself
            if (stng.charAt(0) == 't')
                return "";
            else
                return stng;
        }

        // If the first character of the input string is 't', remove it from the string
        if (stng.charAt(0) == 't')
            stng = stng.substring(1, stng.length());

        // If the last character of the input string is 't', remove it from the string
        if (stng.charAt(stng.length() - 1) == 't')
            stng = stng.substring(0, stng.length() - 1);

        return stng; // Return the modified string
    }

    // Main method to execute the program
    public static void main(String[] args) {
        Problem_65 m = new Problem_65(); // Create an instance of the Main class

        String str1 = "testcricket"; // Input string

        // Display the given string and the new string using excludeT method
        System.out.println("The given strings is: " + str1);
        System.out.println("The new string is: " + m.excludeT(str1));
    }
}