// package lecture;
//  class Mobile
// {
//     String brand;
//     int price;
//     String model;
//     static String network;
//     Mobile(){};
//     public static void show(Mobile obj)
//     {
//         System.out.println("Static Method is called.");
        
//     }
// }

// public class StaticMethod {
//     public static void main(String[] args) {
//         Mobile obj=new Mobile();
//         obj.brand="Samsung";
//         obj.model="S25 Ultra";
//         obj.price=150000;
//         Mobile.network="Jio";
//         System.out.println("Brand:"+obj.brand);
//         System.out.println("Price:"+obj.price);
//         System.out.println("Model:"+obj.model);
//         System.out.println("Network:"+Mobile.network);
       
//     }
    
// }
package lecture;
 class Mobile
{
    String brand;
    int price;
    String model;
    static String network;
    Mobile(){};
    public static void show(Mobile obj)
    {
        System.out.println("Static Method is called.");
         System.out.println("Brand:"+obj.brand);
        System.out.println("Price:"+obj.price);
        System.out.println("Model:"+obj.model);
        System.out.println("Network:"+Mobile.network);
       
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        Mobile obj=new Mobile();
        obj.brand="Samsung";
        obj.model="S25 Ultra";
        obj.price=150000;
        Mobile.network="Jio";
         Mobile.show(obj);
    }
    
}
