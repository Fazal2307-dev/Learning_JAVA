//A string is created by using another string's letters. Letters are case sensitive.
//Write a Java program that checks the letters of the second string are present in the
// first string. Return true otherwise false.
import java.util.Scanner;

public class Problem_112 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Create a Scanner object for user input

        // Prompt the user to input the first and second strings
        System.out.println("Input the first string: ");
        String text = myObj.nextLine(); // Read the first string
        System.out.println("Input the second string: ");
        String word = myObj.nextLine(); // Read the second string

        // Check if the first string contains all letters from the second string
        System.out.println("Check first string contains letters from the second string:\n" + test(text, word));
    }

    // Method to check if the first string contains all letters from the second string
    public static boolean test(String first_string, String second_string) {
        if (second_string.length() > first_string.length()) return false; // If the second string is longer, return false
        if (second_string.isEmpty()) return true; // If the second string is empty, return true

        // Iterate through each character in the second string
        for (int i = 0; i < second_string.length(); i++) {
            // If the first string does not contain the current character from the second string, return false
            if (!first_string.contains(String.valueOf(second_string.charAt(i)))) {
                return false;
            }
        }
        return true; // Return true if all characters from the second string are found in the first string
    }
}