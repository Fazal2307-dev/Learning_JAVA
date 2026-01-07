//Write a Java program to create a basic string compression method
// using repeated character counts.
import java.util.Scanner;

public class Problem_56 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt the user to enter a string (including spaces)
        System.out.println("Enter a string (you can include space as well):");
        String s1 = in.nextLine();

        // Trim all the spaces from the string using replaceAll method
        String s2 = s1.replaceAll("\\s", "");

        // Call the Compression method to compress the string
        Compression(s2);
    }

    // Create a Java Method Compression to compress the string
    public static String Compression(String s) {
        int count = 1;
        StringBuilder sb = new StringBuilder();

        // Loop through the string
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                sb.append(s.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        // Append the last character and its count
        if (s.length() > 0) {
            sb.append(s.charAt(s.length() - 1)).append(count);
        }

        // Convert the StringBuilder to a string
        String compressed = sb.toString();

        // Print the compressed string along with the counts of repeated characters
        System.out.println("The compressed string along with the counts of repeated characters is:\n" + compressed);

        // Return the compressed string
        return compressed;
    }
}