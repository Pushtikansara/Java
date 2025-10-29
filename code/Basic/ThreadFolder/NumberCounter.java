package Basic.ThreadFolder;

public class NumberCounter extends Thread {
    public void run(){
        int count = 1;
        for(int i=1; i<=5000000; i++){
            if(i%10==7){
                count++;
            }
        }
        System.out.println("Count of numbers ending with 7: " + count);
    }
}
