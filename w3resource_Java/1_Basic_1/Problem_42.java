//Write a Java program to create a string taking the first three
// characters from a given string. If the string length is less than 3
// use "#" as substitute characters.
import java.lang.*;

public class Problem_42 {
    public static void main(String[] args) {
        // Define an empty string
        String str1 = "";

        // Get the length of the string
        int len = str1.length();

        // Check the length of the string and take different actions based on its length
        if (len >= 3) {
            // If the string has three or more characters, print the first three characters
            System.out.println(str1.substring(0, 3));
        } else if (len == 1) {
            // If the string has only one character, add "##" to it and print
            System.out.println(str1.charAt(0) + "##");
        } else {
            // If the string is empty or has two characters, print "###"
            System.out.println("###");
        }
    }
}