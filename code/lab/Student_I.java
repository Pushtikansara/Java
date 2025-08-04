// File: Student_I.java
package lab;

public class Student_I extends Institute {
    String sid;
    String sname;
    String sem;

    public Student_I(String sid, String sname, String sem) {
        super(); // optional: prints welcome message from Institute
        this.sid = sid;
        this.sname = sname;
        this.sem = sem;
    }

    public void display() {
        System.out.println("----- Student Details -----");
        System.out.println("Student ID   : " + sid);
        System.out.println("Student Name : " + sname);
        System.out.println("Semester     : " + sem);
        System.out.println("----- Institute Details -----");
        System.out.println("Institute Name: " + iname);
        System.out.println("Location      : " + location);
    }
}
