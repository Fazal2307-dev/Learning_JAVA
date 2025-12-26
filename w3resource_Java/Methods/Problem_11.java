//Write a Java method that accepts three integers and
// returns true if one is the middle point between the
// other two integers, otherwise false.
import java.util.Scanner;
public class Problem_11{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of a:");
        int a = in.nextInt();
        System.out.print("Enter value of b:");
        int b = in.nextInt();
        System.out.print("Enter value of c:");
        int c = in.nextInt();
        if(b==((a+c)/2))
            System.out.println("Yes");
        else System.out.println("NO");
    }
}