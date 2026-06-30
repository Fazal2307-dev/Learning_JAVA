class FirstThread extends Thread{
    public void run() {
        System.out.println("FirstThread.run()...START..: " + Thread.currentThread().getName());
        for(int i =0;i<10;i++) {
            System.out.println(i + Thread.currentThread().getName());
            Thread.yield();//pause the  current thread and give chance to other thread
        }

        System.out.println("FirstThread.run()...END..: " + Thread.currentThread().getName());

    }
}

public class Problem_1 {

    public static void main(String[] args) {
        FirstThread t1 = new FirstThread();
        t1.setName("t1");
        t1.start();


        FirstThread t2 = new FirstThread();
        t2.setName("t2");
        t2.start();

    }

}
