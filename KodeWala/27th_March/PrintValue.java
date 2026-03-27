import java.util.*;
class PrintValue{
    public static void main(String[] args){
        int userValue =0;
        int userDesieredValue = 13;
        Scanner sc = new Scanner(System.in);
        System.out.println("you value is.....");
        while ( userValue != userDesieredValue){
            userValue = sc.nextInt();
            System.out.println("your typed value is :"+userValue);
            if(userValue == userDesieredValue){
            System.out.println("you won!!!!!");
            } else {
                System.out.println("Try again");
            }
        }
    }
}