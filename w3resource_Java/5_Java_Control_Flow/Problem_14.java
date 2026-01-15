//Write a Java program to display the multiplication table of a given integer.
import java.util.*;
public class Problem_14{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n=in.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(n + "X"+i +"="+n*i);

        }
    }

}