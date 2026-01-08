//Write a Java program to check whether three given lengths (integers)
// of three sides form a right triangle. Print "Yes" if the given sides
// form a right triangle otherwise print "No".


import java.util.Arrays;
import java.util.Scanner;

public class Problem_60 {
    // Creating a Scanner object for user input
    Scanner sc = new Scanner(System.in);

    // Method to execute the main functionality
    public void run() {
        // Prompting the user to input three integers (sides of a triangle)
        System.out.println("Input three integers (sides of a triangle):");

        // Reading three integers and storing them in an array
        int[] sides = new int[]{
                sc.nextInt(), sc.nextInt(), sc.nextInt()
        };

        // Sorting the array of integers in ascending order
        Arrays.sort(sides);

        // Checking if the given sides form a right triangle
        System.out.println("If the given sides form a right triangle?");
        if (sides[2] * sides[2] == sides[0] * sides[0] + sides[1] * sides[1]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    // Main method to create an instance of the class and run the program
    public static void main(String[] args) {
        new Problem_60().run();
    }
}
