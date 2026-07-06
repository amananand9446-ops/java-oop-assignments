import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ArrayCreator creator=new ArrayCreator(10);

        ExecutorService executor= Executors.newSingleThreadExecutor();
        Future<ArrayList<Integer>> future=executor.submit(creator);
        ArrayList<Integer> result=future.get();
        System.out.println(result);

        executor.shutdown();
    }
}