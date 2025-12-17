//find the largest and smallest element in the array
public class Problem_7{
    public static void main(String[] args){
        int []a = {15,78,96,36,23,47};
        int min = a[0],max =a[0];
        for(int v:a){
            if(v<min)
                min=v;
            else if(v>max)
                max = v;
        }
        System.out.print("Min:"+ min +" "+ "Max:"+max);
    }
}