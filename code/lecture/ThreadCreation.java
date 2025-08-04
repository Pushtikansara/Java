package lecture;

public class ThreadCreation extends Thread{
    // ThreadCreation(String s){
    //     super (s);//to retrive something from parent class
    // }
    ThreadCreation(){
        //to retrive something from parent class
    }
    public void run(){
        try{//using for sleep 
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
        // ThreadCreation thread = new ThreadCreation("My thread");
         ThreadCreation thread = new ThreadCreation();
        // thread.setName("My thread");
        System.out.println(thread);
        
        thread.start();
        System.out.println(Thread.currentThread().getName() + " currently in " + thread.getState());
    }
    
}
//different 5 state 