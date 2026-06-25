

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class BankAccount5{
    private int balance =1000;
    ReentrantLock reentrantLock = new ReentrantLock();
    public  void withdraw(int amount) throws InterruptedException {

        boolean lockStatus = reentrantLock.tryLock(2000,TimeUnit.MILLISECONDS);
        System.out.println("BackAccount.withdraw() " + lockStatus);
        if (lockStatus) {
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
        else {
            System.out.println();
        }
        //reentrantLock.unlock();

    }
    //	@SuppressWarnings("unused")
//	private boolean reentrantLock(int i, TimeUnit milliseconds) {
//		// TODO Auto-generated method stub
//		return false;
//	}
    public int getBalance() {
        return balance;
    }
}
class Customer5 extends Thread{

    private BankAccount5  account;
    public Customer5(BankAccount5 account,String name) {
        super(name);
        this.account=account;
    }
    @Override
    public void run() {
        try {
            account.withdraw(800);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
public class Problem_2 {

    public static void main(String[] args) throws InterruptedException {
        BankAccount5 account = new BankAccount5();
        System.out.println("Raunak's Init Balance = " + account.getBalance());

        Customer5 t1 = new Customer5(account,"Raunak is doing PhonePay");
        Customer5 t2 = new Customer5(account,"Raunak's Brother is doing GPay");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("final Balnace = " + account.getBalance());



    }

}

