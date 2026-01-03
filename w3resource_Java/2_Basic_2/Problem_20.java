//Write a Java program to reverse a sentence (assume a single space
// between two words) without reverse every word.
import java.util.*;
public class Problem_20{
    public static String reverse_str_word(String input_sentence) {
        // Checking if the input string is null
        if (input_sentence == null) {
            throw new IllegalArgumentException("Input param can't be null."); // Throwing an exception for null input
        }

        StringBuilder stringBuilder = new StringBuilder(); // Creating a StringBuilder to store the reversed string
        String[] words = input_sentence.split(" "); // Splitting the input sentence into words based on spaces

        // Loop to append words in reverse order to the StringBuilder
        for (int i = words.length - 1; i >= 0; i--) {
            stringBuilder.append(words[i]); // Appending each word in reverse order

            if (i != 0) {
                stringBuilder.append(" "); // Adding space between words except for the last word
            }
        }

        return stringBuilder.toString(); // Returning the reversed string of words
    }

    // The main method of the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creating a Scanner object to read input from the user

        // Asking the user to input a string
        System.out.print("Input a string: ");
        String input = scanner.nextLine(); // Reading the input string from the user

        // Displaying the result by reversing the words in the input string
        System.out.println("\nResult: " + reverse_str_word(input));
    }
}