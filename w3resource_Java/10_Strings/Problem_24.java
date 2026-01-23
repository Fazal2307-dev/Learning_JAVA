//Write a Java program to replace a specified character with another character.
public class Problem_24 {

    // Define the main method.
    public static void main(String[] args) {
        // Declare and initialize a string variable.
        String str = "The quick brown fox jumps over the lazy dog.";

        // Replace all the 'd' characters with 'f' characters.
        String new_str = str.replace('d', 'f');

        // Display the original and modified strings for comparison.
        System.out.println("Original string: " + str);
        System.out.println("New String: " + new_str);
    }
}