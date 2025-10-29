package Basic.ThreadFolder;

public class SumCalc implements Runnable{
    public void run(){
        int sum = 0;
        for(int i=1; i<=100000; i++){
            sum += i;
        }
        System.out.println("Sum is: " + sum);
    }
}
