//Write a Java program to prove that Euclid’s algorithm computes
// the greatest common divisor of two integers that have positive values.
import java.util.Scanner;
public class Problem_10{
    public static int euclid(int x, int y){
        if (x == 0 || y == 0) {
            return 1;
        }

        // If x is less than y, swap the values using a temporary variable
        if (x < y) {
            int t = x;
            x = y;
            y = t;
        }

        // Check if x is divisible by y
        if (x % y == 0) {
            return y; // Return y if it evenly divides x
        } else {
            return euclid(y, x % y); // Recursively call the euclid method with y and the remainder of x/y
        }
    }

    public static void main(String[] args) {
        // Displaying the result of the Euclidean algorithm for specific pairs of numbers
        System.out.println("result: " + euclid(48, 24));
        System.out.println("result: " + euclid(125463, 9658));
    }
}