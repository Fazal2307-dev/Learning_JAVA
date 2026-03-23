class Operator{
    public static void main(String[] args){
        int value=100;
        String userValue = args[0];
        int userInput = Integer.parseInt(userValue);
        System.out.println("User input provide through cmd:"+userInput);
        if(userInput > value){
            System.out.println("Your are reacher than value:");
        } else{
            System.out.println("You are not");
        }
    }
}
