import java.util.Arrays;

public class Problem_10 {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != diff) {
                return false;
            }
        }
        return true;
    }

    // main method must be inside the class
    public static void main(String[] args) {
        Problem_10 sol = new Problem_10();

        int[] arr1 = {3, 5, 1};
        System.out.println(sol.canMakeArithmeticProgression(arr1)); // true

        int[] arr2 = {1, 2, 4};
        System.out.println(sol.canMakeArithmeticProgression(arr2)); // false
    }
}