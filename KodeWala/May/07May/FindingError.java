public class FindingError {
    public static void main(String[] args) {
        System.out.println("Programme started from Here :");
        int amount=1000;
        String name = "Kodewala";
        System.out.println("amount :"+amount);
        System.out.println("name :"+name);
        try {
            System.out.println("Before Exception :");
            int result = amount/0;
            System.out.println("result :"+result);
            System.out.println("After Exception :");
        }
        catch(ArithmeticException e) {
            e.printStackTrace();
            System.out.println("you can't divide anything with zero :");
        }
        System.out.println("Programme End Here:");
    }
}