class MyThreads extends Thread{
    public void run(){
        for(int i =0;i<100;i++){
            if(i % 2 !=0){
                System.out.println("Printing even no : "+ i );
            }
        }
    }
}
public class Problem_1 {
    public static void main(String[] args){
        MyThreads t1 = new MyThreads();
        t1.start();

    }
}