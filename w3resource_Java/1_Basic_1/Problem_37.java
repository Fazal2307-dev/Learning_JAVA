//Write a Java program to insert a word in the middle of another string.
// Insert "Tutorial" in the middle of "Python 3.0", so the result will be
// Python Tutorial 3.0.
import java.lang.*;

public class Problem_37{
    public static void main(String[] args) {
        // Define the main string and the word to insert
        String main_string = "Python 3.0";
        String word = "Tutorial";

        // Create a new string by concatenating substrings
        String result = main_string.substring(0, 7) + word + main_string.substring(6);

        // Print the resulting string
        System.out.println(result);
    }
}
