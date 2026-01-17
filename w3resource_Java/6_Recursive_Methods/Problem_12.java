//Write a Java recursive method to find the maximum element in an array.
public class Problem_12{
    public static int findMaxElement(int[] arr, int index) {
        // Base case: last element
        if (index == arr.length - 1) {
            return arr[index];
        }
        // Recursive case: compare current element with max of rest
        return Math.max(arr[index], findMaxElement(arr, index + 1));
    }

    public static void main(String[] args) {
        int[] array = {34, 45, 34, 23, 56, 62, 27, 55};
        System.out.println("Original Array: " + Arrays.toString(array));
        int maxElement = findMaxElement(array, 0);
        System.out.println("The maximum element in the array is: " + maxElement);
    }
}
