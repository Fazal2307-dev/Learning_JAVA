class MyThread extends Thread{
    public void run(){
        for(int i =0;i<20;i++){
            if(i%2 ==0){
                System.out.println("Printing some no from list: "+ i +MyThread.currentThread().getName());

            }
        }
    }
}
public class Problem_1 {
    public static void main(String[] args){
        MyThread t1 = new MyThread();
                t1.start();
    }
}