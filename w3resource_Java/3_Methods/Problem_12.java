//Write a Java method to count the number of digits in an
// integer with the value 2. The integer may be assumed to
// be non-negative.
import java.util.Scanner;
public class Problem_12{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter vaalue of n:");
        int n = in.nextInt();
        int count=0;
        while(n!=0){
            if(n%10 ==2)
                count++;
            n/=10;
        }
        System.out.println("no of 2 in this:"+count);
    }
}