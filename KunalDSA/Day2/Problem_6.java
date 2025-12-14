//Positive,negative,zero
import java.util.Scanner;
public class Problem_6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n=sc.nextInt();
        if(n>0) System.out.println("N is Positive");
        else if(n<0) System.out.println("N is Negative");
        else System.out.println("N is zero");
    }
}