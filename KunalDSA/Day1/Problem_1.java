import java.util.Scanner;
public class Problem_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N:");
        int num = sc.nextInt();
        for( int i=1;i<=num;i++){
            for( int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}