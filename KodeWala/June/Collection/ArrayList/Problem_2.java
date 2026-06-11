//Write a Java program to iterate through all elements in an array list..
import java.util.*;
public class Problem_2 {
    public static void main(String[] args){
        List<String> ele = new ArrayList<String>();
        ele.add("Monday");
        ele.add("Tuesday");
        ele.add("Wednesday");
        ele.add("Thursday");
        ele.add("Friday");
        ele.add("Saturday");
        ele.add("Sunday");
        for (String element : ele) {
            System.out.println(element);
        }
    }
}