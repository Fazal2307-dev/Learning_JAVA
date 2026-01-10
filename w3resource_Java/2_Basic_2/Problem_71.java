//There are two circles C1 with radius r1, central coordinate (x1, y1) and C2 with radius r2 and central coordinate (x2, y2).
//Write a Java program to test the followings -
//"C2 is in C1" if C2 is in C1
//"C1 is in C2" if C1 is in C2
//"Circumference of C1 and C2 intersect" if circumference of C1 and C2 intersect, and
//"C1 and C2 do not overlap" if C1 and C2 do not overlap.
import java.util.*;
public class Problem_71{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        // Prompting the user to input x1, y1, and r1 for the first circle
        System.out.println("Input x1, y1, r1: (numbers are separated by a space)");
        double x1 = in.nextDouble(), y1 = in.nextDouble(), r1 = in.nextDouble();

        // Prompting the user to input x2, y2, and r2 for the second circle
        System.out.println("Input x2, y2, r2: (numbers are separated by a space)");
        double x2 = in.nextDouble(), y2 = in.nextDouble(), r2 = in.nextDouble();

        // Calculating the distance between the centers of the two circles
        double l = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

        // Checking the relationship between the circles based on their radii and distance
        if (l > r1 + r2)
            System.out.println("Circumference of C1 and C2 intersect");
        else if (r1 > l + r2)
            System.out.println("C2 is in C1");
        else if (r2 > l + r1)
            System.out.println("C1 is in C2");
        else
            System.out.println("C1 and C2 do not overlap");
    }
}