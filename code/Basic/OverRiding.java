class Payment{
   void pay(double amount){
     System.out.println("Processing payment:"+amount);
 }
}
class UPI extends Payment{
   void pay(double amount){
     System.out.println("UPI payment:"+amount);
 }
}
class CreditCard extends Payment{
   void pay(double amount){
     System.out.println("Credit card payment:"+amount);
 }

}

public class OverRiding{
    public static void main(String[]ar){
           Payment paym=new Payment();
           paym.pay(5000);
         
  }
  
}