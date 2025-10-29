package Basic.ThreadFolder;

public class Multithread {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        SumCalc sumCalc = new SumCalc();
        Thread thread1 = new Thread(sumCalc);
       
        NumberCounter numberCounter = new NumberCounter();
        numberCounter.start();
        thread1.start();

        try {
        numberCounter.join();
          thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
      
        System.out.println("Time taken: " + (System.currentTimeMillis()-startTime) + " ms");

    }
    
}
