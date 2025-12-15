//Reverse a number
import java.util.Scanner;
public class Problem_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n = sc.nextInt();
        int rev=0;
        while(n>0){
          int rem = n%10;
            n = n/10;
            rev = rev*10 + rem;
        }
        System.out.print("Reverse of a number:"+rev);
    }
}