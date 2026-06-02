//Write a Java program to iterate through all elements in a linked list.
import java.util.*;
public class Iterate_LinkedList_Elements{
    public static void main(String args[]){
        LinkedList<String> list = new LinkedList<String>() ;
        list.add("Patna");
        list.add("Delhi");
        list.add("Banglore");
        list.add("Singapure");
        for(String element : list){
            System.out.println(list);
        }
    }
}