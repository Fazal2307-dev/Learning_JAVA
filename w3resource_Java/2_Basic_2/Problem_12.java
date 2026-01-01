//Write a Java program to find the k largest elements in a given array.
// Elements in the array can be in any order.
import java.util.*;
public class Problem_12{
    public static void main(String[] args){
        Integer arr[] = new Integer[]{1, 4, 17, 7, 25, 3, 100};

        int k = 3; // Initializing the value of 'k' as 3

        // Displaying the original array
        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(arr));

        // Displaying the k largest elements of the array
        System.out.println(k + " largest elements of the said array are:");

        // Sorting the array in reverse order using Collections.reverseOrder()
        Arrays.sort(arr, Collections.reverseOrder());

        // Printing the k largest elements from the sorted array
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}