//Q2. Find the Pivot Integer
public class Problem_11{
    public int pivotInteger(int n) {
        // Total sum from 1 to n
        int total = n * (n + 1) / 2;

        // Try each possible x
        for (int x = 1; x <= n; x++) {
            int leftSum = x * (x + 1) / 2; // sum from 1 to x
            int rightSum = total - (x - 1) * x / 2; // sum from x to n
            if (leftSum == rightSum) {
                return x;
            }
        }
        return -1; // no pivot found
    }

    // Main method for testing
    public static void main(String[] args) {
        Problem_11 sol = new Problem_11();

        int n1 = 8;
        System.out.println(sol.pivotInteger(n1)); // Output: 6

        int n2 = 1;
        System.out.println(sol.pivotInteger(n2)); // Output: 1

        int n3 = 4;
        System.out.println(sol.pivotInteger(n3)); // Output: -1
    }
}

