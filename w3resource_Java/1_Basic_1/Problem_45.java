//Write a Java program to get the current system environment and system
// properties.
import java.lang.*;

public class Problem_45 {
    public static void main(String[] args) {
        // Print a message indicating the display of the current system environment
        System.out.println("\nCurrent system environment:");

        // Retrieve and print the system environment variables using System.getenv()
        System.out.println(System.getenv());

        // Print a message indicating the display of the current system properties
        System.out.println("\n\nCurrent system properties:");

        // Retrieve and print the system properties using System.getProperties()
        System.out.println(System.getProperties());
    }
}