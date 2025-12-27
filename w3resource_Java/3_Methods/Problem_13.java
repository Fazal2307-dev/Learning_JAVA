//Write a Java method (takes n as input) to display an n-by-n matrix.
import java.util.Scanner;
public class Problem_13{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n = in.nextInt();
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((int) (Math.random() * 2) + " ");
            }
            System.out.println();
        }
    }
}
