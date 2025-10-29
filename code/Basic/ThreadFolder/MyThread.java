package Basic.ThreadFolder;

public class MyThread extends Thread {
    
      public Counter counter = new Counter();
      public MyThread(Counter counter){
          this.counter = counter;
      }
      public void run(){
        for(int i=0; i<1000; i++){
            counter.increment();

      }

    }
    public static void main(String[] args) {
        Counter counter = new Counter();
        MyThread thread1 = new MyThread(counter);
        MyThread thread2 = new MyThread(counter);
        thread1.start();
        thread2.start();
        System.out.println("Final count: " + counter.getCount());
      
    }
}
class Counter{
    int count = 0;
    public void increment(){
        count++;
    }
    public int getCount(){
        return count;
    }
}