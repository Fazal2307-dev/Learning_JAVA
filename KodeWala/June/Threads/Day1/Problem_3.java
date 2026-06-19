//Write a Java program that creates two threads to find and print even and odd
// numbers from 1 to 20.
class evenThread extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("Even no :" + i + " " + MyThread3.currentThread().getName());
            }
        }
    }
}
    class oddThread extends Thread {
        public void run() {
            for (int i = 1; i <= 20; i++) {
                if (i % 2 != 0) {
                    System.out.println("Odd no :" + i + " " + MyThread3.currentThread().getName());
                }
            }
        }
    }
public class Problem_3 {
    public static void main(String[] args){
        evenThread t1 = new evenThread();
        t1.start();

        oddThread t2 = new oddThread();
        t2.start();
    }
}