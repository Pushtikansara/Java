package lab;
import java.util.Scanner;

public class Prac1_1 {
    public static void main(String[] args) {
       
        // Class1 obj = new Class1("Pushti", 52, "Computer Science", 50000);
        // System.out.println("Name: " + obj.getName());
        // System.out.println("Student ID: " + obj.getID());
        // System.out.println("Department: " + obj.getDept());
        // System.out.println("Salary: " + obj.getSalary());
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your ID: ");
        int ID = sc.nextInt();
        
        System.out.println("Enter your department: ");
        String dept = sc.nextLine();
        System.out.println("Enter your salary: ");      
        int salary = sc.nextInt();
        Class1_1 obj = new Class1_1(name, ID, dept, salary);
        System.out.println("Name: " + obj.getName());
        System.out.println("Student ID: " + obj.getID());
        System.out.println("Department: " + obj.getDept());
        System.out.println("Salary: " + obj.getSalary());

        sc.close();
        
    }
}
