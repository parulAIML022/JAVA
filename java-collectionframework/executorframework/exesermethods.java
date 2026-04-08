package executorframework;
import java.util.concurrent.*;

public class exesermethods {
    public static void main(String[] args) throws InterruptedException, ExecutionException{
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<Integer> submit = executor.submit(() -> 10+20);
        Integer i = submit.get();
        System.out.println("sum is:"+ i);
        System.out.println(executor.isTerminated()); /* if this is written just after
        shutdown then it will return false because just after shutting down we asked if is it terminated or not
        so use .sleep() before */
    }
}
