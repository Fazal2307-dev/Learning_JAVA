//Write a Java program to create an array list, add some colors (strings) and print out
// the collection.
import java.util.*;
public class Problem_1 {
    public static void main(String[] args) {
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        System.out.println(list_Strings);
    }
}