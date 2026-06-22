
class evenThread1 implements Runnable{

	@Override
	public void run() {// running
		System.out.println("evenThread.run().... START :"+Thread.currentThread().getName());
		for(int i =0;i<=20;i++) {
			if(i %2 ==0) {
				System.out.println("Even no from input :"+  i + " " + Thread.currentThread().getName());
				try {
                    Thread.sleep(1000);// 1000ms means 1sec  pause after printing each even number
                    System.out.println("Waiting time 1 sec so wait");
           // Here we are using sleep method  so after every output it will go out from waiting state to
           //runnable state then running state
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
			}
		}
		System.out.println("evenThread.run()......END :" + Thread.currentThread().getName() );


	}//once run method is completed, your thread t1 is terminated/ Dead

}

public class Problem_2 {

	public static void main(String[] args) {
		evenThread1 EThread = new evenThread1();
		Thread  t1 =new Thread(EThread); // new Born Thread object
		t1.start();//Thread Moved from new born to Runnable



	}

}
