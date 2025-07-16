package Task;

interface Add {
    int sum(int a, int b);
}

interface Subs {
    int sub(int a, int b);
}

interface Multi {
    int mul(int a, int b);
}

interface Div {
    int div(int a, int b);
}

class Answer implements Add, Subs, Multi, Div {
    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    @Override
    public int mul(int a, int b) {
        return a * b;
    }

    @Override
    public int div(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero error!");
            return 0;
        }
        return a / b;
    }
}

public class Calc {
    public static void main(String[] args) {
        Answer ans = new Answer();

        System.out.println("Addition: " + ans.sum(10, 5));
        System.out.println("Subtraction: " + ans.sub(10, 5));
        System.out.println("Multiplication: " + ans.mul(10, 5));
        System.out.println("Division: " + ans.div(10, 5));
    }
}
