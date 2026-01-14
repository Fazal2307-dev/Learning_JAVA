//Write a Java program to create the concatenation of the two strings
// except removing the first character of each string. The length of the
// strings must be 1 and above.
import java.lang.*;

public class Problem_41 {
    public static void main(String[] args) {
        // Define two strings
        String str1 = "Python";
        String str2 = "Tutorial";

        // Print the substrings of both strings, excluding the first character
        System.out.println(str1.substring(1) + str2.substring(1));
    }
}