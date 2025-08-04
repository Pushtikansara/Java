import calc.Addition;
import calc.Subtraction;
import calc.Multiplication;
import calc.Division;

public class CalcMain {
    public static void main(String[] args) {
        Addition add = new Addition();
        Subtraction sub = new Subtraction();
        Multiplicatio mul = new Multiplication();
        Division div = new Division();

        System.out.println("Addition: " + add.add(10, 5));
        System.out.println("Subtraction: " + sub.sub(10, 5));
        System.out.println("Multiplication: " + mul.mul(10, 5));
        System.out.println("Division: " + div.div(10, 5));
    }
}