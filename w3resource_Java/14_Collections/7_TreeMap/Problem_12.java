//Write a Java program to get the greatest key less than or equal to the given key.
import java.util.*;
import java.util.Map.Entry;
public class Problem_12 {
    public static void main(String args[]) {
        // Create a tree map
        TreeMap < Integer, String > tree_map1 = new TreeMap < Integer, String > ();
        // Put elements to the map
        tree_map1.put(10, "Red");
        tree_map1.put(20, "Green");
        tree_map1.put(40, "Black");
        tree_map1.put(50, "White");
        tree_map1.put(60, "Pink");

        System.out.println("Orginal TreeMap content: " + tree_map1);
        System.out.println("Checking the entry for 10: ");
        System.out.println("Key is: " + tree_map1.floorKey(10));
        System.out.println("Checking the entry for 30: ");
        System.out.println("Key is: " + tree_map1.floorKey(30));
        System.out.println("Checking the entry for 70: ");
        System.out.println("Key is: " + tree_map1.floorKey(70));
    }
}