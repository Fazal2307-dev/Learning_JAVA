//Largest of two number
import java.util.Scanner;
public class Problem_4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a and b:");
        int a =sc.nextInt(),b=sc.nextInt();
        if(a>b)
            System.out.print("a is greater than b");
        else
            System.out.print("b is greater than a");
    }
}