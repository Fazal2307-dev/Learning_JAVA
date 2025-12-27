//sum of digit
import java.util.Scanner;
public class Problem_16{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n = sc.nextInt();
        int sum=0;
        while(n!=0){
            int rem = n%10;
            sum = sum + rem;
            n/=10;
        }
        System.out.print("Value of sum:"+sum);
    }
}