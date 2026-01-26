//Write a Java program to find the first non-repeating character from a stream of
// characters.
import java.util.*;

// Define a class named Main.
public class Problem_48{

    // Main method to execute the program.
    public static void main(String[] args) {

        // Define the maximum number of characters.
        int MXCHAR = 256;

        // Create a list to store characters in a doubly linked list.
        List inDLL = new ArrayList();

        // Create a boolean array to check if a character is repeated.
        boolean[] repeatyn = new boolean[MXCHAR];

        // Define the input string.
        String chrstream = "godisgood";
        System.out.println("String: " + chrstream);

        // Loop through each character in the input string.
        for (int i = 0; i < chrstream.length(); i++) {

            // Get the character at the current index.
            char x = chrstream.charAt(i);
            System.out.println("Reading: " + x);

            // Check if the character is non-repeating.
            if (!repeatyn[x]) {
                // If the character is not repeated yet.
                if (!(inDLL.contains(x))) {
                    inDLL.add(x); // Add the character to the list.
                } else {
                    // If the character is already in the list, remove it and mark it as repeated.
                    inDLL.remove((Character) x);
                    repeatyn[x] = true;
                }
            }

            // Display the first non-repeating character encountered so far.
            if (inDLL.size() != 0) {
                System.out.print("The first non-repeating character so far is:  ");
                System.out.println(inDLL.get(0));
            }
        }
    }
}