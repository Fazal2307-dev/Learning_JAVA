class numberThread implements Runnable{
    public void run()
    {
        System.out.println("numberThread.run()............ : "+Thread.currentThread().getName());
    }

}

public class Problem_3 {

    public static void main(String[] args) {
        numberThread  numthread = new numberThread();
        Thread t1 = new Thread(numthread);
        t1.run();

    }

}