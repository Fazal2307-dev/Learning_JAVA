public class Test {

    public static void main(String[] args) {
        System.out.println("This is sample program - START");
        String amountStr = args[0];
        int amount = Integer.parseInt(amountStr);//1s00 NumberFormatException

        String name = args[1];
        int result = amount;//result = amount / 0; -> ArithmeticException
        System.out.println("result :"+result);
        System.out.println("Amount :"+amount);
        System.out.println("Length :"+name.length()); //name =null -> nullPointerException

        System.out.print("This is sample program - END");
    }

}