//Write a Java method that accepts three integers
// and checks whether they are consecutive or not.
// Returns true or false.
import java.util.Scanner;
public class Problem_10{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of a:");
        int a = in.nextInt();
        System.out.print("Enter value of b:");
        int b = in.nextInt();
        System.out.print("Enter value of c:");
        int c = in.nextInt();
        if(a+1==b && b+1==c)
            System.out.println("Yes");
        else
            System.out.println("NO");
    }
}