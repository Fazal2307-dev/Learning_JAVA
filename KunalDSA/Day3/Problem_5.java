//sum of digit of number
import java.util.Scanner;
public class Problem_5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n = sc.nextInt();
        int sum=0;
        while(n!=0){
            sum = sum + n%10;
            n/=10;
        }
        System.out.print(sum);
    }
}