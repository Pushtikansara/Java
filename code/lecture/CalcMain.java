package lecture;

import lecture.CalcExtra;


public class CalcMain {
    public static void main(String[] args) {
        Addition add = new Addition();
        Subtraction sub = new Subtraction();
        Multiplication mul = new Multiplication();
        Division div = new Division();

        System.out.println("Addition is: " + add.add(20, 5));
        System.out.println("Subtraction is: " + sub.sub(20, 5));
        System.out.println("Multiplication is: " + mul.mul(4, 5));
        System.out.println("Division is: " + div.div(40, 5));
    }
}