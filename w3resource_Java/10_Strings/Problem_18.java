//Write a Java program to create a distinct identifier for a given string.
public class Problem_18 {
    // Define the main method.
    public static void main(String[] args) {
        // Declare and initialize a string variable.
        String str = "Python Exercises.";

        // Get the hash code for the string.
        int hash_code = str.hashCode();

        // Display the hash code.
        System.out.println("The hash for " + str +
                " is " + hash_code);
    }
}