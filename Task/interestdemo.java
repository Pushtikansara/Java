package Task;

class Interest {
    int principal;
    int rate;
    int time;

    Interest(int p, int r, int t) {
        principal = p;
        rate = r;
        time = t;
    }

    int calculateInterest() {
        return (principal * rate * time) / 100;
    }
}
class Compare {
    static void compare(int a, int b) {
        if(a > b){
            System.out.println("Amount 1 is greater than Amount 2");
        } else if(a < b) {
            System.out.println("Amount 2 is greater than Amount 1");
        } else {
            System.out.println("Both amounts are equal");
        }
    }
}

public class interestdemo {
    public static void main(String[] args) {
        int Amount1, Amount2;

        Interest i1 = new Interest(1000, 5, 2); 
        Amount1 = i1.calculateInterest();
        System.out.println("Simple Interest of amount 1: " + Amount1);

        Interest i2 = new Interest(2000, 10, 3);
        Amount2 = i2.calculateInterest();
        System.out.println("Simple Interest of amount 2: " + Amount2);
        System.out.println("Comparing the two amounts:");
        Compare.compare(Amount1, Amount2);
    }
}
