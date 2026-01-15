//Write a Java program that takes three numbers from the user and prints
// the greatest number.
import java.util.*;
public class Problem_3{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of a:");
        int a = in.nextInt();
        System.out.print("Enter value of b:");
        int b = in.nextInt();
        System.out.print("Enter value of c:");
        int c = in.nextInt();
        if(a >b && a>c){
            System.out.println("A is greater than Both:");
        }else if(b>a && b>c){
            System.out.println("B is greater than Both:");
        }else{
            System.out.println("C is greater than Both:");
        }


    }
}