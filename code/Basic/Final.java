package Basic;
class calc{
    public final void show(){
        System.out.println("By Navin");
    }
    public void add (int a,int b){
        System.out.println(a+b);
    }
}
class Advcalc extends calc{
    // public void show(){
    //     System.out.println("By Niva");
    // }
    public void add (int a,int b){
        System.out.println(a+b+1);
    }
}

public class Final {
    public static void main(String[] args) {
        Advcalc obj=new Advcalc();
        obj.show();
        obj.add(3, 4);

   

    }
}
