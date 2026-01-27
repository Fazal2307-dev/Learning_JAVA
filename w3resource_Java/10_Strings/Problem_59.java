//Write a Java program to read a string. If the string begins with "red" or "black"
// return that color string, otherwise return the empty string.
import java.util.*;

// Define a class named Main
public class Problem_59{

    // Method to pick a color from the beginning of the string
    public String pickColor(String str) {
        // Check if the string starts with "red", return "red" if true
        if (str.startsWith("red"))
            return "red";
        // Check if the string starts with "black", return "black" if true
        if (str.startsWith("black"))
            return "black";
        else
            return ""; // Return an empty string if the string doesn't start with "red" or "black"
    }

    // Main method to execute the program
    public static void main(String[] args) {
        Problem_59 m = new Problem_59(); // Create an instance of the Main class

        // Define a string to check for the color at the beginning
        String str1 = "blacksea";

        // Display the given string and the color it begins with using the pickColor method
        System.out.println("The given string is: " + str1);
        System.out.println("The string begins with the color: " + m.pickColor(str1));
    }
}
