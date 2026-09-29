//demonstrate the multilevel inheritance



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

class husky extends dog{
      public void look(){
          System.out.println("husky is beautiful");
      }
 }

public class MultiLevelEx{
      
    public static void main(String ar[]){
          dog d=new dog();
          d.look(); 
          d.sound();
          husky c=new husky();
          c.look();
          c.sound();

     }
}


