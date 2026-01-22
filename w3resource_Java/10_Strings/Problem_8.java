//Write a Java program to test if a given string contains the specified
// sequence of char values.
public class Problem_8 {
    // Define the main method.
    public static void main(String[] args) {
        // Declare and initialize two string variables, str1 and str2.
        String str1 = "PHP Exercises and Python Exercises";
        String str2 = "and";

        // Print the original string.
        System.out.println("Original String: " + str1);
        // Print the specified sequence of char values.
        System.out.println("Specified sequence of char values: " + str2);

        // Check if str1 contains the sequence specified in str2 and print the result.
        System.out.println(str1.contains(str2));
    }
}