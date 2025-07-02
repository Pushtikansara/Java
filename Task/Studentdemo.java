package Task;

class Student {
    int rollno;
    String name;

    Student() {}

    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    public void display(int rollno, String name) {
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
    }
}

class child extends Student {
    String sub1, sub2, sub3;

    child(int r, String n, String s1, String s2, String s3) {
        super(r, n);
        sub1 = s1;
        sub2 = s2;
        sub3 = s3;
    }

    public void display() {
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Subject 1: " + sub1);
        System.out.println("Subject 2: " + sub2);
        System.out.println("Subject 3: " + sub3);
    }
}

public class Studentdemo{
    public static void main(String[] args) {
        child obj = new child(1, "John", "Math", "Science", "English");
        obj.display(obj.rollno, obj.name); // Calling Student class method
        obj.display();                     // Calling child class method
    }
}
