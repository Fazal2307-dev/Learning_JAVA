//Largest of three number
import java.util.Scanner;
public class Problem_5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a,b and c:");
        int a =sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        if(a>b && a>c)
            System.out.println("A is greater than both B and C");
        else if(b>a && b>c)
            System.out.println("B is greater than both A and C");
        else
            System.out.println("C is greater than both A and B");
    }
}