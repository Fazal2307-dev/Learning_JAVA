//Write a Java program to find the maximum number inside the number in the window (size k)
// at each step in a given array of integers
// with duplicate numbers. Move the window to the top of the array.
import java.util.*;
public class Problem_25 {
    public static void main(String[] args) {
        int[] main_array = {1, 2, 3, 4, 5, 6, 7, 8, 8};
        int k = 3;

        System.out.println("\nOriginal array: " + Arrays.toString(main_array));
        System.out.println("\nValue of k: " + k);
        System.out.println("\nResult: ");

        // Use generics here
        ArrayList<Integer> result = max_slide_window(main_array, k);

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static ArrayList<Integer> max_slide_window(int[] main_array, int k) {
        ArrayList<Integer> rst_arra = new ArrayList<>();

        if (main_array == null || main_array.length == 0 || k <= 0) {
            return rst_arra;
        }

        Deque<Integer> deque_num = new LinkedList<>();

        // First k elements
        for (int i = 0; i < k; i++) {
            while (!deque_num.isEmpty() && main_array[deque_num.peekLast()] <= main_array[i]) {
                deque_num.pollLast();
            }
            deque_num.offerLast(i);
        }

        // Remaining elements
        for (int i = k; i < main_array.length; i++) {
            rst_arra.add(main_array[deque_num.peekFirst()]);

            if (!deque_num.isEmpty() && deque_num.peekFirst() <= i - k) {
                deque_num.pollFirst();
            }

            while (!deque_num.isEmpty() && main_array[deque_num.peekLast()] <= main_array[i]) {
                deque_num.pollLast();
            }
            deque_num.offerLast(i);
        }

        rst_arra.add(main_array[deque_num.peekFirst()]);
        return rst_arra;
    }
}
