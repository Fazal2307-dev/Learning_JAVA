//Write a Java method to check whether every digit of a given integer
// is even. Return true if every digit is odd otherwise false.
import java.util.Scanner;
public class Problem_9{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n = in.nextInt();
        int rem;
        while(n!=0){
            rem = n %10;
            n/=10;
            if(rem %2 ==0)
                System.out.println(true);
            else
                System.out.println(false);
        }
    }
}