

class BankAccount {
    private int balance = 1000;

    // synchronized deposit method
    public synchronized void deposit(int amount) {
        System.out.println(Thread.currentThread().getName() + " depositing " + amount);
        balance += amount;
        System.out.println("Balance after deposit: " + balance);
    }

    // synchronized withdraw method
    public synchronized void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " withdrawing " + amount);
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Balance after withdraw: " + balance);
        } else {
            System.out.println("Insufficient funds! Current balance: " + balance);
        }
    }
}

class TransactionThread extends Thread {
    private BankAccount account;
    private boolean deposit;

    public TransactionThread(BankAccount account, boolean deposit) {
        this.account = account;
        this.deposit = deposit;
    }

    @Override
    public void run() {
        if (deposit) {
            account.deposit(500);
        } else {
            account.withdraw(700);
        }
    }
}

public class Problem_3{
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        TransactionThread t1 = new TransactionThread(account, true);   // deposit thread
        TransactionThread t2 = new TransactionThread(account, false);  // withdraw thread
        TransactionThread t3 = new TransactionThread(account, false);  // another withdraw thread

        t1.setName("Thread-Deposit");
        t2.setName("Thread-Withdraw1");
        t3.setName("Thread-Withdraw2");

        t1.start();
        t2.start();
        t3.start();
    }
}
