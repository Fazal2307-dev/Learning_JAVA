//Write a Java program to create a basic Java thread that prints "Hello, World!" when
// executed.

class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("MyThread.run().... :"+Thread.currentThread().getName());
        System.out.println("Hello, World!");
    }
}
public class Problem_2 {
    public static void  main(String[] args){
        MyThread t1 = new MyThread();
        t1.start();
    }
}