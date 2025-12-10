import java.util.Scanner;
public class Problem_3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Value:");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            char name = (char)('a' + i-1);
            for(int j=1;j<=num-i+1;j++){
                System.out.print(name);
            }
            System.out.println();
        }
    }
}