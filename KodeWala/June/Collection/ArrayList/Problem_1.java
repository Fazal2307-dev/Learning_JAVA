//1.Write a Java program to create an array list, add some colors (strings) and print
// out the collection.
import java.util.*;
public class Problem_1 {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("green");
        list.add("Red");
        list.add("Blue");
        list.add("Purpole");
        System.out.println("list of color :"+list);
    }
}