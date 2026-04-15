 class Account {

    private int balance=1000;


    //setter
    public void deposite(int _amount ) {
        if(_amount > 0) {
            balance += _amount;
        }else {
            System.out.println("Invalid Amount");
        }
    }
    public int getBalance() {
        return balance;
    }

}
public class EncapsulationExp{

    public static void main(String[] args) {
        Account acc = new Account();
        acc.deposite(200);
        System.out.println("Your Total amount after adding :"+acc.getBalance());

    }

}
