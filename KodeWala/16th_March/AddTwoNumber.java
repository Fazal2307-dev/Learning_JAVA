//write a programme to addtwo number
class AddTwoNumber{
    public static void main(String args[]){
        if(args.length <1){
            System.out.println("pls provide two number");
            return ;
        }
        int firstNumber = Integer.parseInt(args[0]);
        int secondNumber = Integer.parseInt(args[1]);
        int sum = firstNumber+secondNumber;
        System.out.println("AddTwoNumber:"+sum);
    }
}