class calculator{
  int add(int a,int b){
       return a+b;
     }
  double add(double a,double b){
     return a+b;
   }
  int add(int a,int b,int c){
       return a+b+c;
       }
}

public class polymorphismEx{
    public static void main(String[]ar){
           calculator calc=new calculator();
           int ans=calc.add(4,5,6);
           System.out.println(ans);
  }
  
}