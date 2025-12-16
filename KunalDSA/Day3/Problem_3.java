//Prime check
import java.util.Scanner;
public class Problem_3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n = sc.nextInt();
        if(n<2) System.out.print("Not Prime");
        for(int i=2;i<n;i++){
            if(n%i ==0) System.out.print("Not Prime");
        }
        System.out.print("Prime no");
    }
}