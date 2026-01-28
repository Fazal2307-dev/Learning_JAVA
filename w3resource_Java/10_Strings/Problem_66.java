//Write a Java program to read a string and return it without the first two characters.
// Keep the first character if it is 'g' and keep the second character if it is 'h'.
import java.util.*;

// Define a class named Main
public class Problem_66{

    // Method to exclude first 'g' and second 'h' characters from the input string
    public String exceptFirstTwo(String stng) {
        // Get the length of the input string
        int len = stng.length();
        String temp = ""; // Create an empty string

        // Iterate through each character in the input string
        for (int i = 0; i < len; i++) {
            // If the current index is 0 and the character is 'g', append 'g' to the temporary string
            if (i == 0 && stng.charAt(i) == 'g')
                temp += 'g';
                // If the current index is 1 and the character is 'h', append 'h' to the temporary string
            else if (i == 1 && stng.charAt(i) == 'h')
                temp += 'h';
                // If the current index is greater than 1, append the character to the temporary string
            else if (i > 1)
                temp += stng.charAt(i);
        }
        return temp; // Return the modified string
    }

    // Main method to execute the program
    public static void main(String[] args) {
        Problem_66 m = new Problem_66(); // Create an instance of the Main class

        String str1 = "ghost"; // Input string

        // Display the given string and the new string using exceptFirstTwo method
        System.out.println("The given strings is: " + str1);
        System.out.println("The new string is: " + m.exceptFirstTwo(str1));
    }
}