package lecture;


public class UsingImplements implements Runnable {

    public UsingImplements() {
        // Constructor
    }

    public void run() {
        try {
            System.out.println("" + Thread.currentThread().getName());
            Thread.sleep(10000);
            System.out.println(Thread.currentThread().getState());
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("IN run method; thread name is:" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        UsingImplements runnable = new UsingImplements();
        Thread t1 = new Thread(runnable);
        System.out.println(runnable);

        t1.start();
        System.out.println(Thread.currentThread().getName() + " currently in " + t1.getState());
    }

}
//different 5 state 
