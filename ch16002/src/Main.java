import java.util.concurrent.*;

public class Main {
    private static final int THRESHOLD = 100000;
    public static void main(String[] args) {

        int[] data = new int[1000000];

        for (int i = 0; i < data.length; i++) {
            data[i] = i;
        }

        ExecutorService executorService = Executors.newFixedThreadPool(4);

        long startTime = System.currentTimeMillis();
        Future<Integer> sumFuture = executorService.submit(new SumTask(data, 0, data.length));
        int sum = 0;
        try {
            sum = sumFuture.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Sum: " + sum);
        System.out.println("Time taken: " + (endTime - startTime) + "ms");

        executorService.shutdown();

    }
    public static class SumTask implements Callable<Integer> {
        private final int[] data;
        private final int start;
        private final int end;
        private final ExecutorService executorService = Executors.newCachedThreadPool();

        public SumTask(int[] data, int start, int end) {
            this.data = data;
            this.start = start;
            this.end = end;
        }

        @Override
        public Integer call() throws Exception {
            int length = end - start;

            if (length <= THRESHOLD) {
                int sum = 0;
                for (int i = start; i < end; i++) {
                    sum += data[i];
                }
                return sum;
            } else {
                int mid = start + length / 2;

                SumTask leftTask = new SumTask(data, start, mid);
                SumTask rightTask = new SumTask(data, mid, end);
                Future<Integer> rightFuture = executorService.submit(rightTask);
                Future<Integer> leftFuture = executorService.submit(leftTask);

                int rightSum = rightFuture.get();
                int leftSum = leftFuture.get();
                return leftSum + rightSum;
            }

        }
    }
}