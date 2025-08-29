package lecture;

import lecture.CalcExtra;


public class CalcMain {
    public static void main(String[] args) {
        Addition add = new Addition();
        Subtraction sub = new Subtraction();
        Multiplication mul = new Multiplication();
        Division div = new Division();

        System.out.println("Addition: " + add.add(10, 5));
        System.out.println("Subtraction is: " + sub.sub(10, 5));
        System.out.println("Multiplication is: " + mul.mul(10, 5));
        System.out.println("Division is: " + div.div(10, 5));
    }
}