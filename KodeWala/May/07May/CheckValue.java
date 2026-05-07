public class CheckValue {
    public static void main(String[] args){
        String name =null;
        try{
            System.out.println("Code Start Here :");
            System.out.println("value of name :"+name.length());
            System.out.println("Code End Here :");
        } catch(NullPointerException e){
            e.printStackTrace();
            System.out.println("you can't use .length() method to null value :");

        }
    }
}