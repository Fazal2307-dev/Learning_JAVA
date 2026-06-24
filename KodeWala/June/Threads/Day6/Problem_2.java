class BankAccount1{
    private int balance =1000;
    public  void withdraw(int amount) {

        synchronized(this) {
            if(balance  >= amount) {
                System.out.println(Thread.currentThread().getName() + " is withdrawing "+ amount);
                try {
                    Thread.sleep(100);
                }catch(InterruptedException e) {
                    e.printStackTrace();
                }
                balance = balance - amount;
                System.out.println(Thread.currentThread().getName() + " completed withdrawal.Balance = " + balance);

            }else {
                System.out.println(Thread.currentThread().getName() + "  Insufficient Balance  ");
            }

        }
    }

    public int getBalance() {
        return balance;
    }
}
class Customer extends Thread{

    private BankAccount1  account;

    public Customer(BankAccount1 account,String name) {
        super(name);
        this.account=account;
    }
    @Override
    public void run() {
        account.withdraw(800);

    }
}
public class Problem_2 {

    public static void main(String[] args) throws InterruptedException  {
        BankAccount1 account = new BankAccount1();
        System.out.println("Raunak's Init Balance = " + account.getBalance());

        Customer t1 = new Customer(account,"Raunak is doing PhonePay");
        Customer t2 = new Customer(account,"Raunak's Brother is doing GPay");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("final Balnace = " + account.getBalance());
    }
}

