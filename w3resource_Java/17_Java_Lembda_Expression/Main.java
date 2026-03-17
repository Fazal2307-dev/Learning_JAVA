//Write a Java program to implement a lambda expression to find the sum of two integers.
interface SumCalculator {
    int sum(int a, int b);
}
public class Main {
    public static void main(String[] args) {
        SumCalculator sumCalculator = (x, y) -> x + y;
        int result = sumCalculator.sum(7, 6);
        System.out.println("Sum 7,6): " + result);
        result = sumCalculator.sum(15, -35);
        System.out.println("Sum 15, -35): " + result);
    }
}