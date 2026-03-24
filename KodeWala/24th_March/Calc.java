class Calc{
    public  static void main(String[] args){
        Calc c = new Calc();
        int output = c.addTwoNumber(5,7);
        System.out.println("Value :"+output);
    }

    int addTwoNumber(int firstNum,int secNum){
        int sum = firstNum+secNum;
        return sum;
    }
}