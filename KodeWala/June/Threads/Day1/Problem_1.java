class MyThread extends Thread{
    public void run(){
        System.out.println("MyThread.run().... :"+Thread.currentThread().getName());
    }
}


public class Problem_1 {
    public static void main(String[] args){
        System.out.println("Problem_1.main()  START... :"+Thread.currentThread().getName());
        MyThread t0 = new MyThread();
        t0.start();
        MyThread t1 = new MyThread();
        t1.start();

    }
}