package Task;
public class Bank{
    float rate;
    Bank(){}
    Bank(float r) {
        rate = r;
    }
    public void display(float rate) {
        System.out.println("Rate of Interest: " + rate + "%");
    }
}
public class Branch extends Bank {
    int time;
    int n;
    Branch(float r, int t,int n) {
        super(r);
        time = t;
    }
    public void display(float rate) {
        super.display(rate);
        System.out.println("Time Period: " + time + " years");
    }

}
public class Client extends Branch{
    
}
public class interst {
    
}
