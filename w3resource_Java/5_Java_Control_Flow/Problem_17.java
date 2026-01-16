//Write a program in Java to make such a pattern like a right angle triangle with a
// number which repeats a number in a row.
import java.util.*;
public class Problem_17{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n = in.nextInt();
        for(int i =1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print(i);
                System.out.println("");
            }
        }
    }
}