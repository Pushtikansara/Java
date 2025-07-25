package Task;
interface A{
   int getA(int a);

   }
interface B extends A
{
   float getB(float b);

}
interface C extends A{

double getC(double c);
}
interface D extends B,C{

    long getD(long d);

}

class E implements D {

    @Override
    public int getA(int a) {
        return a;
    }

    @Override
    public float getB(float b) {
        return b;
    }

    @Override
    public double getC(double c) {
        return c;
    }

    @Override
    public long getD(long d) {
        return d;
    }
}

public class InterfaceCalc {
    public static void main(String[] args) {
        E e = new E();
        int a = e.getA(10);
        float b = e.getB(10.5f);
        double c = e.getC(20.5);
        long d = e.getD(100);

        double result = a * b * c * d;
        System.out.println("Result:" + result);
    }
}
