//check even or odd
import java.util.Scanner;
public class Problem_3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your value of n:");
        int n=sc.nextInt();
        System.out.println(n%2==0 ? "even":"odd");

    }
}