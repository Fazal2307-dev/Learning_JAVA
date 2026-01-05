//Write a Java program to accept a positive number and
// repeatedly add all its digits until the result has only one digit.
import java.util.Scanner;
public class Problem_32{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n = in.nextInt();

        while(n>9) {
            int sum =0;
            while (n != 0) {
                int rem = n % 10;
                n /= 10;
                sum = sum + rem;
            }
            n = sum;
        }
        System.out.print("Value after sum:"+n);
    }
}