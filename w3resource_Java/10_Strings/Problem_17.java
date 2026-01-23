//Write a Java program to get the contents of a given string as a character array.
public class Problem_17 {
    // Define the main method.
    public static void main(String[] args) {
        // Declare and initialize a string variable.
        String str = "This is a sample string.";

        // Create a character array to hold copied characters.
        // Copy characters 4 through 10 from the 'str' string to the 'arr' array.
        // Start filling the 'arr' array from position 2.
        char[] arr = new char[] { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' };
        str.getChars(4, 10, arr, 2);

        // Display the contents of the character array.
        System.out.println("The char array equals \"" +
                arr + "\"");
    }
}