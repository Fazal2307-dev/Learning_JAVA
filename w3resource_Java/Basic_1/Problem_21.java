//Write a Java program that accepts three integers from
// the user and returns true if two or more of them (integers)
// have the same rightmost digit.
import java.util.Scanner;
public class Problem_21{
    public static void main(String[] argss){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of a:");
        int a=in.nextInt();
        System.out.print("Enter vaalue of b:");
        int b = in.nextInt();
        System.out.print("Enter vaalue of c:");
        int c =in.nextInt();
        if(a%10==b%10 || b%10==c%10 ||a%10==c%10){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}