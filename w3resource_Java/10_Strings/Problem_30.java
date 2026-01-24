//Write a Java program to convert all characters in a string to uppercase.
public class Problem_30 {

    // Define the main method.
    public static void main(String[] args) {
        // Declare and initialize a string variable.
        String str = "The Quick BroWn FoX!";

        // Convert the above string to all uppercase.
        String upper_str = str.toUpperCase();

        // Display the original and uppercase strings for comparison.
        System.out.println("Original String: " + str);
        System.out.println("String in uppercase: " + upper_str);
    }
}