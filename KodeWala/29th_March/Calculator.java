class Calculator{
    public int addNumber(int num1,int num2){
        int sum = num1 + num2;
        return sum;
    }
    public void main(String[] args){
        Calculator cal = new Calculator();
        int result = cal.addNumber(15,25);
        System.out.println("The sum is: " + result);
    }
}