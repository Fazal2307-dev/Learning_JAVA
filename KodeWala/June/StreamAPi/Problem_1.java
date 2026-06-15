import java.util.*;
import java.util.stream.Collectors;
public class Problem_1{
    public static void main(String[] args){
        List<String> city = Arrays.asList("Patna","Lucknow","Nalanda","Bhagalpur","Banglore");
        List<String> outPut = city.stream().filter(w -> w.startsWith("B")).map(l -> l.toUpperCase()).collect(Collectors.toList());
        System.out.println("OutPut "+ outPut);
    }
}