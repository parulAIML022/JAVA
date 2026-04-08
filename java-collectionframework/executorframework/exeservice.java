package executorframework;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class exeservice {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for(int i = 1 ; i < 10 ; i++){
            int finalI = i;
            executor.submit(() -> {
                long result = factorial(finalI);
                System.out.println(result);
            });
        }
        executor.shutdown();
        System.out.println("Total Time:"+(System.currentTimeMillis() - startTime));
    }
    private static long factorial(int n) {
        long result = 1;
        for(int i = 1 ; i <= n ; i++){
            result*=  i;
        }
        return result;
    }
    
}
