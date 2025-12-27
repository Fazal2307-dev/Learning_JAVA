//Write a Java program to print the area and perimeter of a rectangle.
import java.util.Scanner;
public class Problem_10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of length and breadth:");
        int length = sc.nextInt(),breadth =sc.nextInt();
        //Area of rectangle
        int AreaOfRectangle = length * breadth;
        System.out.println("Area of Rectangle:"+AreaOfRectangle);
        //Perimeter of Rectangle
        int PerimeterOfRectangle = 2*length*breadth;
        System.out.print("Perimeter of Rectangle:"+PerimeterOfRectangle);
    }
}