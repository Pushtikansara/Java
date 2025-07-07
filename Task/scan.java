package Task;
import java.util.Scanner;

public class scan {
    public static void main(String[]args)
   {
    int a,b,total=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number: ");
    a = sc.nextInt();
    System.out.println("Enter second number: ");
    b = sc.nextInt();
    total=a+b;
    System.out.println("Total:"+total);
    sc.close();
    



   }
    
}
