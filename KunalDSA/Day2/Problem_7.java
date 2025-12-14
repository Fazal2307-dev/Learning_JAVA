// swap two number with and Without Variable
import java.util.Scanner;
public class Problem_7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a and b:");
        int a=sc.nextInt(),b=sc.nextInt();
        int temp = a;
        a=b;
        b=temp;
        System.out.print(a+" "+b);
    }
}