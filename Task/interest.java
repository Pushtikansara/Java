package Task;

class Bank {
    float rate;

    Bank() {}

    Bank(float r) {
        rate = r;
    }

    public void display() {
        System.out.println("Rate of Interest: " + rate + "%");
    }
}

class Branch extends Bank {
    int time;
    int number;

    Branch(float r, int t, int n) {
        super(r);
        time = t;
        number = n;
    }

    public void display() {
        super.display();
        System.out.println("Time period (number): " + number);
        System.out.println("Time Period elapsed: " + time + " years");
    }
}

class Client extends Branch {
    float amount;

    Client(float r, int t, int n, float a) {
        super(r, t, n);
        amount = a;
    }

    public void display() {
        super.display();
        System.out.println("Amount: " + amount);
        float compoundinterest = (float)(amount * Math.pow((1 + rate / 100), time)) - amount;
        System.out.println("Interest earned: " + compoundinterest);
    }
}

public class interest {
    public static void main(String[] args) {
        Client c = new Client(5.0f, 2, 1, 10000.0f);
        c.display();
    }
}
