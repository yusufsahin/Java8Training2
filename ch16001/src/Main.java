import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Main {
    private static final int THRESHOLD=100000;
    public static void main(String[] args) {
        int[] data=new int[1000000];
        for (int i=0;i<data.length;i++)
        {
            data[i]=i;
        }

        ForkJoinPool pool= new ForkJoinPool();

        long startTime=System.currentTimeMillis();

        int sum=pool.invoke(new SumTask(data,0,data.length));

        long endTime=System.currentTimeMillis();

        System.out.println("Sum: "+sum);
        System.out.println("Time taken: "+(endTime-startTime)+"ms");

    }

    public static  class  SumTask extends RecursiveTask<Integer>
    {
        private final int[] data;
        private final  int start;
        private  final int end;

        public SumTask(int[] data, int start, int end) {
            this.data = data;
            this.start = start;
            this.end = end;
        }


        @Override
        protected Integer compute() {
            int lenght= end-start;

            if(lenght<=THRESHOLD){
                int sum=0;
                for(int i=start;i<end;i++)
                {
                    sum+=data[i];
                }
                return sum;
            }else
            {
                int mid=start+lenght/2;

                SumTask leftTask= new SumTask(data,start,mid);
                SumTask rightTask= new SumTask(data,mid,end);
                leftTask.fork();
                int rightSum= rightTask.compute();
                int leftSum= leftTask.join();
                return  leftSum+rightSum;

            }
        }
    }
}