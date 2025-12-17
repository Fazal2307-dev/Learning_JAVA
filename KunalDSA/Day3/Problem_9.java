//find duplicate elements in an array
import java.util.*;
public class Problem_9{
    public static void main(String[] args){
        int[] a={1,2,3,1,2,4,5};
        java.util.Set<Integer> seen = new java.util.HashSet<>();
        java.util.Set<Integer> dup = new java.util.HashSet<>();
        for(int v:a) if(!seen.add(v)) dup.add(v);
        System.out.println(dup);
    }
}