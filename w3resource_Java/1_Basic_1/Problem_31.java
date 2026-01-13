//Write a Java program to test that a given array of integers of
// length 2 contains a 4 or a 7.
import java.util.Arrays;

public class Problem_31 {
    public static void main(String[] args) {
        // Define an integer array, array_nums
        int[] array_nums = {5, 7};

        // Print the elements of the original array
        System.out.println("Original Array: " + Arrays.toString(array_nums));

        // Check if the first element of the array is 4 or 7 and print the result
        if (array_nums[0] == 4 || array_nums[0] == 7) {
            System.out.println("True");
        } else {
            // If the first element is not 4 or 7, check the second element and print the result
            System.out.println(array_nums[1] == 4 || array_nums[1] == 7);
        }
    }
}