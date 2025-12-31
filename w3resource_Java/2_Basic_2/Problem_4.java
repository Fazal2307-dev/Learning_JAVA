//Write a Java program to find the k smallest elements
// in a given array. Elements in the array can be in any order.
import java.util.*;
public class Problem_4{
public static void main(String[] args) {
    // Initializing an array of integers
    Integer arr[] = new Integer[]{1, 4, 17, 7, 25, 3, 100};

    int k = 3; // Initializing the value of 'k' as 3

    // Displaying the original array
    System.out.println("Original Array: ");
    System.out.println(Arrays.toString(arr));

    // Displaying the k smallest elements of the array
    System.out.println(k + " smallest elements of the said array are:");

    // Sorting the array in ascending order
    Arrays.sort(arr);

    // Printing the k smallest elements from the sorted array
    for (int i = 0; i < k; i++) {
        System.out.print(arr[i] + " ");
    }
}
}