//Write a Java program that takes three numbers as input to calculate
// and print the average of the numbers.
import java.util.Scanner;
public class Problem_9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a,b and c:");
        int a = sc.nextInt(),b=sc.nextInt(),c = sc.nextInt();
        double Average = (a+b+c)/3;
        System.out.print("Average of a,b and c:"+Average);
    }
}
