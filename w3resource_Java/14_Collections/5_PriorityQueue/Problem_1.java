//Write a Java program to create a priority queue, add some colors (strings) and
// print out the elements of the priority queue.
import java.util.PriorityQueue;
public class Problem_1 {
    public static void main(String[] args) {
        PriorityQueue<String> queue=new PriorityQueue<String>();
        queue.add("Red");
        queue.add("Green");
        queue.add("Orange");
        queue.add("White");
        queue.add("Black");
        System.out.println("Elements of the Priority Queue: ");
        System.out.println(queue);
    }
}