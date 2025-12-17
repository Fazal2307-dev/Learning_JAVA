//sort on array(ascending/descending)
import java.util.*;
public class Problem_8{
    public static void main(String[] args) {
        Integer[]a = {9,7,3,1,2};
        Arrays.sort(a);
        System.out.println(java.util.Arrays.toString(a));
        Arrays.sort(a,java.util.Collections.reverseOrder());
        System.out.println(java.util.Arrays.toString(a));

    }
}