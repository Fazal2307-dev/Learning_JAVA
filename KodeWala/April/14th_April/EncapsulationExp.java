class BankAccount{
    private double balance;
    public BankAccount(double balance){
        this.balance=balance;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited : " + amount);
        }else{
            System.out.println("Invalid amount!");
        }
    }
    public void withdraw(double amount){
        if(amount > 0 && amount<= balance){
            balance -= amount;
            System.out.println("Withdraw :"+amount);
        }else{
            System.out.println("Insufficient funds or invalid amount!");
        }
    }
}
 public class EncapsulationExp {
    public static void main(String[] args){
        BankAccount acc = new BankAccount(1000);
        acc.deposit(500);
        acc.withdraw(200);
        System.out.println("Final Balance : "+acc.getBalance());
    }
}