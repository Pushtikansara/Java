import java.util.*;
public class student{
        public static void main(String []ar){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your name");
            String s1=sc.next();

            System.out.println("Enter your maths mark");
            int maths=sc.nextInt();

            System.out.println("Enter your english mark");
            int eng=sc.nextInt();

            System.out.println("Enter your science mark");
            int sci=sc.nextInt();

            int total=maths+eng+sci;
            double percentage=(total/300)*100;

            System.out.println("Maths mark"+maths); 
            System.out.println("Science mark"+sci);
            System.out.println("English mark"+eng);   
            System.out.println("My total is"+" "+total+"and percentage is"+" "+percentage);
          
      }

}


