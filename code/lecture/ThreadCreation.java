package lecture;

public class ThreadCreation extends Thread{
    ThreadCreation(){}
    public void run(){
        try{
        System.out.println(""+Thread.currentThread().getName());
        sleep(10000);
        System.out.println(Thread.currentThread().getState());
        }
        catch(InterruptedException ex)
        {
            ex.printStackTrace();
        }
        System.out.println("IN run method; thread name is:"+Thread.currentThread().getName());
    }

    public static void main(String[] args){
        ThreadCreation thread = new ThreadCreation();
        thread.start();
        System.out.println(Thread.currentThread().getName() + " currently in " + thread.getState());
    }
    
}
//different 5 state 