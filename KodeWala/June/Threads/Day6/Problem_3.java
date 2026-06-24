class BankAccount2 {
    private static int balance = 1000; // shared balance

    public static void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " Some other logic..... 50 lines....");

        synchronized (BankAccount2.class) { // class-level lock
            if (balance >= amount) {
                System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                balance = balance - amount;
                System.out.println(Thread.currentThread().getName() + " completed withdrawal. Balance = " + balance);
            } else {
                System.out.println(Thread.currentThread().getName() + " Insufficient Balance");
            }
        }
    }

    public static int getBalance() {
        return balance;
    }
}

class Customer1 extends Thread {
    public Customer1(String name) {
        super(name);
    }

    @Override
    public void run() {
        BankAccount2.withdraw(800); // static method call
    }
}

public class Problem_3 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Raunak's Init Balance = " + BankAccount2.getBalance());

        Customer1 t1 = new Customer1("Raunak is doing PhonePay");
        Customer1 t2 = new Customer1("Raunak's Brother is doing GPay");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Balance = " + BankAccount2.getBalance());
    }
}
