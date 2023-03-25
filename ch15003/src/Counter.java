public class Counter {

    private  int count=0;

    //public  void increment()
    public synchronized void increment()
    {
        count++;
        System.out.println(count);
    }

   // public  void decrement()
    public synchronized void decrement() {
        count--;
    }

    //public  int getCount() {
    public synchronized int getCount() {
        return count;
    }
}
