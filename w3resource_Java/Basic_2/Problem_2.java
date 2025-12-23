//Write a Java program that accepts four integers from the user and
// prints equal if all four are equal, and not equal otherwise.
import java.util.Scanner;
public class Problem_2{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of a:");
        int a =in.nextInt();
        System.out.print("Enter value of b:");
        int b =in.nextInt();
        System.out.print("Enter value of c:");
        int c =in.nextInt();
        System.out.print("Enter value of d:");
        int d =in.nextInt();
        if( a==b && b==c && c==d)
            System.out.println("Number are equal");
        else
            System.out.println("Number are not equiled");

    }
}