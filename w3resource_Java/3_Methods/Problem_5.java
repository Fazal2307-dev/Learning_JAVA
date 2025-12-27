//Write Java methods to calculate triangle area.
//using herons formula
import java.util.Scanner;
public class Problem_5{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of side_1:");
        int side_1=in.nextInt();
        System.out.print("Enter value of side_2:");
        int side_2=in.nextInt();
        System.out.print("Enter value of side_3:");
        int side_3=in.nextInt();

        double s = (side_1+side_2+side_3)/2;

        double AreaOfTriangle =Math.sqrt(s*(s-side_1)*(s-side_2)*(s-side_3));
        System.out.print("Area of Triangle:"+AreaOfTriangle);


    }
}