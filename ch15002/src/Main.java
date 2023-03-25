import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable myCallable = new MyCallable();
        ExecutorService executor= Executors.newSingleThreadExecutor();

        Future<String> future= executor.submit(myCallable);

        System.out.println(future.get());

        executor.shutdown();

    }
}