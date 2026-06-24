//package com.kodewala.threads4;
class BankAccount{
    private int balance =1000;
    public synchronized void withdraw(int amount) {
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
    public int getBalance() {
        return balance;
    }
}
class Customer extends Thread{

    private BankAccount  account;
    public Customer(BankAccount account,String name) {
        super(name);
        this.account=account;
    }
    @Override
    public void run() {
        account.withdraw(800);

    }
}
public class Problem_1 {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        System.out.println("Raunak's Init Balance = " + account.getBalance());

        Customer t1 = new Customer(account,"Raunak is doing PhonePay");
        Customer t2 = new Customer(account,"Raunak's Brother is doing GPay");
        t1.start();
        t2.start();
        System.out.println("final Balnace = " + account.getBalance());



    }

}
