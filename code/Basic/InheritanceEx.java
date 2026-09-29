class animal{
     public void sound(){
     System.out.println("Animal sound");
      }
  }
class dog extends animal{
      public void look(){
          System.out.println("dog is cute");
      }
 }

class cat extends animal{
      public void look(){
          System.out.println("cat is beautiful");
      }
 }

public class InheritanceEx{
      
    public static void main(String ar[]){
          dog d=new dog();
          d.look();
          d.sound();
          cat c=new cat();
          c.look();
          c.sound();

     }
}


