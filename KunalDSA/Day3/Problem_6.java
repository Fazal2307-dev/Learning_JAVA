//Program to Find Sum of Array Elements
public class Problem_6{
    static int arr[] = {12,45,78,96,36};

    static int sum(){
        int sum =0;
        for( int i =0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.print("Sum of all element of arr;" + sum());
    }
}