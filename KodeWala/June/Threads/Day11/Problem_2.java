import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
class EmailSender implements Callable<String>{
    @Override
    public String call() {
        System.out.println(Thread.currentThread().getName());
        return "failed.................";
    }
}
public class Problem_2 {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService es = Executors.newFixedThreadPool(3);
        EmailSender task = new EmailSender();
        for(int i =0;i<5;i++) {
            //es.shutdown();
            Future<String> response = es.submit(task);
            System.out.println("response from call() method is " + response.get());
        }
        //es.close();
        es.shutdown();
    }

}