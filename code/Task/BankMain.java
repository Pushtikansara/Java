package Task;
class BankAccount {
    private double balance;
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited " + amount +
                           ", Current Balance: " + balance);
    }

   
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew " + amount +
                               ", Current Balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() +
                               " tried to withdraw " + amount + " but Insufficient Balance! " +
                               "Current Balance: " + balance);
        }
    }

 
    public double getBalance() {
        return balance;
    }
}

class BankingTask implements Runnable {
    private BankAccount account;

    public BankingTask(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) { 
            account.deposit(100);
            account.withdraw(50);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class BankMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500); // Initial balance

        Thread t1 = new Thread(new BankingTask(account), "Thread-1");
        Thread t2 = new Thread(new BankingTask(account), "Thread-2");
        Thread t3 = new Thread(new BankingTask(account), "Thread-3");

        // Start threads
        t1.start();
        t2.start();
        t3.start();


        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Balance: " + account.getBalance());
    }
}
