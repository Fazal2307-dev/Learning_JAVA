

class EvenOddThread extends Thread {
    private boolean isEven;

    // Constructor: true → Even, false → Odd
    public EvenOddThread(boolean isEven) {
        this.isEven = isEven;
    }

    @Override
    public void run() {
        if (isEven) {
            System.out.println("EvenThread.run()....START... :" + Thread.currentThread().getName());
            for (int i = 1; i < 20; i++) {
                if (i % 2 == 0) {
                    System.out.println("Even no from input.... :" + i + " " + Thread.currentThread().getName());
                    if (i == 10) {
                        try {
                            Thread.sleep(5000);
                            System.out.println("Waiting time 5 sec so wait");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            System.out.println("EvenThread.run()....END... :" + Thread.currentThread().getName());
        } else {
            System.out.println("OddThread.run()....START... :" + Thread.currentThread().getName());
            for (int i = 1; i < 20; i++) {
                if (i % 2 != 0) {
                    System.out.println("Odd no from input.... :" + i + " " + Thread.currentThread().getName());
                    if (i == 10) {
                        try {
                            Thread.sleep(5000);
                            System.out.println("Waiting time 5 sec so wait");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            System.out.println("OddThread.run()....END... :" + Thread.currentThread().getName());
        }
    }
}

public class Problem_4 {
    public static void main(String[] args) {
        EvenOddThread t1 = new EvenOddThread(true);   // Even thread
        EvenOddThread t2 = new EvenOddThread(false);  // Odd thread

        t1.setName("Thread-Even");
        t2.setName("Thread-Odd");

        t1.start();
        t2.start();
    }
}
