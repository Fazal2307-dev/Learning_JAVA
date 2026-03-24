class Range{
    public static void main(String args[]){
        String num1 = args[0];
        int value1 = Integer.parseInt(num1);
        if(value1>= 10 && value1<50){
            System.out.println("Value is in between :");
        }else{
            System.out.println("Value is not in between :");
        }
    }
}