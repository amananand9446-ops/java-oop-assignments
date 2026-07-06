import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class TreeNodeCalculator implements Callable {
private final Node root;
private final ExecutorService executorService;

    public TreeNodeCalculator(Node root, ExecutorService executorService) {
        this.root = root;
        this.executorService = executorService;
    }

    @Override
    public Object call() throws Exception {
        if(root==null){
            return 0;

        }
        TreeNodeCalculator leftTask=new TreeNodeCalculator(root.left, executorService);
        TreeNodeCalculator rightTask=new TreeNodeCalculator(root.right, executorService);

        //submitting both task

        Future<Integer> leftFuture=executorService.submit(leftTask);
        Future<Integer> rightFuture=executorService.submit(rightTask);

        //wait for the results

        int leftSize=leftFuture.get();
        int rightSize=rightFuture.get();

        //return current size

        return 1+leftSize+rightSize;

    }
}
