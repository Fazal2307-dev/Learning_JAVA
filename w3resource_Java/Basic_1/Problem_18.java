//Write a Java program to compute the area of a polygon
import java.util.Scanner;
public class Problem_18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of side:");
        int ns = sc.nextInt();
        int side = sc.nextInt();
        double AreaOfPolygon = (ns * (side * side)) / (4.0 * Math.tan((Math.PI / ns)));
        System.out.println("Area of Polygon:"+AreaOfPolygon);
    }
}