//write a programme for atm machine
class ATM{
    public static void main(String[] args){
        System.out.println("Welcome to Atm machine");
        Account.main();
    }
}
class Account{
    public static void main(){
        System.out.println("Welcome MD FAZAL");
        Amount.main();
    }
}
class Amount{
    public static void  main(){
        System.out.println("You'r Total Amount is 20,000");
        Exist.main();
    }
}
class Exist{
    public static void main(){
        System.out.println("You'r logged of from ATM");
    }
}