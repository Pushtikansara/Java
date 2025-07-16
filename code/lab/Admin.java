package lab;

public class Admin{

        public static void main(String[] args) {
            System.out.println("Admin class is running.");
            
         Student obj = new Student();
         obj.display();
         obj.setName("Pushti");
         obj.setstdID(52);
         System.out.println("Name: " + obj.getName());
         System.out.println("Student ID: " + obj.getstdID());   

        }

       
}
