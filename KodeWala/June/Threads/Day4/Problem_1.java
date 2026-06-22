class MyRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println("MyRunnable.run()....... : " + Thread.currentThread().getName());

    }
}

public class Problem_1 {
    public static void main(String[] args){
        MyRunnable MyThread = new MyRunnable();
        Thread t1 = new Thread(MyThread);
        t1.start();
    }
}