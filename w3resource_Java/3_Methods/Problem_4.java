//Write a Java method to display the first 50 pentagonal numbers.
import java.util.Scanner;
public class Problem_4{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n = in.nextInt();
        int count =1;
        for(int i=1;i<=n;i++){
            System.out.printf("%-6d",getPentagonalNumber(i));
            if(count % 10 == 0) System.out.println();
            count++;
        }
    }
    public static int getPentagonalNumber(int i) {
        return (i * (3 * i - 1))/2;
        }
    }
