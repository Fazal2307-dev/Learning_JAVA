import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class NotifyDelivery implements Callable<String>{
    @Override
    public String call() {
        DeliveryService ds = new DeliveryService();
        System.out.println("NotifyDelivery.run()...Start...: "+Thread.currentThread().getName());
        ds.confirmDeliver();
        System.out.println("NotifyDelivery.run()...End...: "+Thread.currentThread().getName());

        return "Succedd";
    }
}

public class Problem_1 {

    public static void main(String[] args) {
        //ExecutorService exeService =	Executors.newSingleThreadExecutor(); // only single thread will be created
        //ExecutorService exeService =	Executors.newFixedThreadPool(1); // fixed no of  thread will be created
        ExecutorService exeService =	Executors.newCachedThreadPool(); // thread will be created by exe framework

        for(int i =0;i<1000;i++) {
            NotifyDelivery task = new NotifyDelivery();
            Future<String>  response =  exeService.submit(task);
        }
        exeService.shutdown();
    }

}
 class DeliveryService {
    public void confirmDeliver() {

    }

}