package Basic;
interface A {

    void show();
    void config();
}
interface X{
    void run();
}
interface Y extends X{

}
class B implements X,A{
    public void show(){
         System.out.println("in show.");
     }
     public void config(){
          System.out.println("In config.");
     }
     public void run(){
         System.out.println("In run.");
     }

}

public class InterfaceClass {
    public static void main(String[] args) {
        A obj=new B();
        obj.show();
        obj.config();
        X obj1=new B();
        obj1.run();
    }
    
}
