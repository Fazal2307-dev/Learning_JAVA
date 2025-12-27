//Write a Java program that reads an integer between 0 and 1000
// and adds all the digits in the integer.
import java.util.Scanner;
public class Problem_3{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n=in.nextInt();
        for(int i=0;i<=1000;i++) {
            if (i == n) {
                int rem, sum = 0;
                while (n != 0) {
                    rem = n % 10;
                    n /= 10;
                    sum = sum + rem;
                }
                System.out.print(sum);
            }
        }

    }
}