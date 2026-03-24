//write a programme to check if a number is positive and even
class Positive{
    public static void main(String args[]){
        String userInput = args[0];
        int input = Integer.parseInt(userInput);
        if((input > 0) && (input %2 ==0)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }

}