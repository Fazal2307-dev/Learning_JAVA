import java.util.*;

public class arraylist {

    public static void main(String[] args) {
        ArrayList<Integer> value= new ArrayList<Integer>();
        value.add(5);
        value.add(3);
        value.add(2);
        System.out.println(value);
        value.add(1);
        System.out.println(value);
        value.remove(2);
        System.out.println(value);

    }

}
