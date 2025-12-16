//armstrong no
import java.util.Scanner;
public class Problem_4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n=sc.nextInt();
        int t=n,sum=0;
        while(t!=0){
            int d = t%10;
            sum = sum + d*d*d;
            t/=10;
        }
        System.out.print(sum ==n?"Armstrong" : "Not Armstrong");
    }
}