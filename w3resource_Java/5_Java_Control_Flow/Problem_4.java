//Write a Java program that reads a floating-point number and prints
// "zero" if the number is zero. Otherwise, print "positive" or "negative".
import java.util.*;
public class Problem_4{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter vaalue of n:");
        int n = in.nextInt();
        if(n >=0){
            System.out.print("Positive");
        }else if(n<=0){
            System.out.print("Negative");
        }else{
            System.out.print("Zero");
        }
    }
}