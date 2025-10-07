

class NumberThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Number: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("NumberThread interrupted.");
        }
    }
}

class AlphabetRunnable implements Runnable {
    public void run() {
        try {
            for (char c = 'A'; c <= 'E'; c++) {
                System.out.println("Letter: " + c);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("AlphabetRunnable interrupted.");
        }
    }
}

public class Prac5_1 {
    public static void main(String[] args) {
        NumberThread t1 = new NumberThread();           
        Thread t2 = new Thread(new AlphabetRunnable());
        System.out.println("Starting both threads...\n");
        t1.start();
        t2.start();

    System.out.println("24CE052<-->Pushti Kansara");
    }
}
