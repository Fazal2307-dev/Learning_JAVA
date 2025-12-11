import java.util.Scanner;
public class Problem_10{
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.print("enter value of n:");
       int n = sc.nextInt();
       for(int i=n;i>=1;i--){
           for(int j=1;j<=n-i;j++){
               System.out.print("");
           }
           for(int j=1;j<=2*n-i;j++){
               System.out.print("*");
           }
           for(int j=1;j<=n-i;j++){
               System.out.print("");
           }
           System.out.println();

       }

    }
}