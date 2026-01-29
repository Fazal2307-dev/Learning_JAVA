//Write a Java program to create a string containing every character twice of a given string.
import java.util.*;

// Define a class named Main
public class Problem_82{

    // Method to repeat each character in the given string 'stng' twice
    public String repeatAllTwice(String stng) {
        int l = stng.length(); // Get the length of the given string 'stng'
        String newstring = ""; // Initialize an empty string to store the new string

        // Loop through each character of the string
        for (int i = 0; i < l; i++) {
            // Append the character at index 'i' in 'stng' twice to the 'newstring'
            newstring += stng.substring(i, i + 1) + stng.substring(i, i + 1);
        }
        return newstring; // Return the new string with characters repeated twice
    }

    // Main method to execute the program
    public static void main(String[] args) {
        Problem_82 m = new Problem_82(); // Create an instance of the Main class

        String str1 = "welcome"; // Given string

        // Display the given string and the new string with characters repeated twice
        System.out.println("The given string is: " + str1);
        System.out.println("The new string is: " + m.repeatAllTwice(str1));
    }
}