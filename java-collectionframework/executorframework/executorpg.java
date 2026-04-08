package executorframework;
import java.util.concurrent.Executor;

public class executorpg {
    public static void main(String[] args){
        Executor executor = command -> new Thread(command).start();
        for(int i = 0 ; i < 3 ; i++){
            int taskNo = i;
            executor.execute(() -> System.out.println("Task"+taskNo+"executed by"+Thread.currentThread().getName())
        );
        }
    }
}
