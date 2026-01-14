//Write a Java program to extract the first half of a even string.
import java.lang.*;

public class Problem_39{
    public static void main(String[] args) {
        // Define the main string
        String main_string = "Python";

        // Extract the substring from the beginning to the middle of the string
        String substring = main_string.substring(0, main_string.length() / 2);

        // Print the extracted substring
        System.out.println(substring);
    }
}