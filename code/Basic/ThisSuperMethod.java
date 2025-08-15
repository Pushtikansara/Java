package Basic;
 class A{
   A(){
    System.out.println("in A");
   }
   A(int n){
    System.out.println("in A int");
   }
}
 class B extends A{
     B() {
         super(5);//call parameterized constructor A
         System.out.println("in B");
     }
     B(int n) {
         this();//call default constructor of B
         System.out.println("in B int");
     }
}

public class ThisSuperMethod {
    public static void main(String[] args) {
        B obj=new B(5);
    }
    
}
