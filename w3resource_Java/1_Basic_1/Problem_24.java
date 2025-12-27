//Write a Java program that accepts two integer values
// between 25 and 75 and returns true if there is a common
// digit in both numbers.
import java.util.Scanner;
public class Problem_24{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of a:");
        int a = in.nextInt();
        System.out.print("Enter value of b:");
        int b = in.nextInt();
        if(a >=25 && a<=75 && b>=25 && b<=75)
            System.out.print(true);
        else
            System.out.print(false);
    }
}