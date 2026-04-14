 class ATM{
    private double balance=1000;
    private String pin = "1345";
    public void withdraw(double amountTOWithdraw,String enteredPin){
        System.out.println("current Balance : "+balance);
        if(enteredPin.equals(pin) && amountTOWithdraw <= balance){
            balance = balance-amountTOWithdraw;
            System.out.println("Balance Post Withdraw : "+balance);
        }else{
            System.out.println("Error : Incorrect PIN or insufficient funds.");
        }
    }
    public void deposit(double amount,String enteredPin){
        if(enteredPin.equals(pin)){
            balance= balance+amount;
            System.out.println("R"+amount+"deposited.New balance : R"+balance);
        }else{
            System.out.println("Error : Incorrect PIN.");
        }
    }
}
public class UserAccessATM {
    public static void main(String[] args){
        ATM atm  = new ATM();
        atm.deposit(120,"1345");
        atm.withdraw(200,"1345");
    }
}