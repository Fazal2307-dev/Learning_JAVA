class MyThread extends Thread{
    public void run(){
        System.out.println("MyThread.run().... :"+ Thread.currentThread().getName());
    }
}

public class Problem_1 {
    public static void main(String[] args){
        System.out.println("Problem_1.main()...... :"+ Thread.currentThread().getName());
        MyThread t1 = new MyThread();
        t1.start();
    }
}