class CalculateValue{
    public static void main(String[] args){
        String num1 = args[0];
        String num2 = args[1];
        int value = Integer.parseInt(num1);
        int value2 = Integer.parseInt(num2);
        CalculateValue cal = new CalculateValue();
        int output = cal.multiplication(value,value2);
        System.out.println("Output is :"+output);
    }

    int multiplication(int firstNum,int SecNum){
        int multi = firstNum*SecNum;
        return multi;
    }
}