package lecture;
class A
{
     A()
     {
        System.out.println("Constructor is called.");
     }

    public void show()
    {
        System.out.println("Show method is called.");
    };
}
public class Anonymous
{
    public static void main(String arg[])
    {
      new A();
      new A().show();    
    }
}