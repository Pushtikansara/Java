package Basic;
abstract class animal
{
    public abstract void colour();
    public void sound(){
        System.out.println("sound");
    }
}
class cat extends animal{
    public void colour(){
        System.out.println("Cat is white");
    }
      public void sound(){
        System.out.println("Meow");
    }

}
public class Abstract {
    public static void main(String[] args) {
        animal obj=new cat();
        System.out.print("Colour of cat: ");
        obj.colour();
        System.out.print("Sound is: ");
        obj.sound();

    }
    
}
