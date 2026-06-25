class PrintNo{
    public synchronized void num(){
        for(int i =0;i<20;i++){
            System.out.println("Printing no from given input : " + i +" "+ Thread.currentThread().getName());
        }
    }
}

class MyThread extends Thread{
    PrintNo pn;
    MyThread(PrintNo pn) {
        this.pn = pn;
    }
    @Override
    public void run(){
    pn.num();
    }
}


public class Problem_1 {
    public static void  main(String[] args){
        PrintNo pn = new PrintNo();
        MyThread t1 =new MyThread(pn);
        t1.setName("Thread-1");
        t1.start();

        MyThread t2 =new MyThread(pn);
        t2.setName("Thread-2");
        t2.start();


    }
}