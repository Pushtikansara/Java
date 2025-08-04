package Task;

class Student {
    int rollno;
    String name;

    // Default constructor
    Student() {}

    // Parameterized constructor
    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    // Display method using class fields
    public void display() {
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
    }
}

class Child extends Student {
    String sub1, sub2, sub3;

    // Constructor for Child class
    Child(int r, String n, String s1, String s2, String s3) {
        super(r, n);
        sub1 = s1;
        sub2 = s2;
        sub3 = s3;
    }

    // Overridden display method
    @Override
    public void display() {
        super.display(); // Call superclass method
        System.out.println("Subject 1: " + sub1);
        System.out.println("Subject 2: " + sub2);
        System.out.println("Subject 3: " + sub3);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Child obj = new Child(1, "John", "Math", "Science", "English");
        obj.display(); // Calls Child class display (with inherited + extra details)
    }
}