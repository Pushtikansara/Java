import java.util.*;

class Student {
    private String name;
    private int rollNo;
    private List<Course> courses = new ArrayList<>();

    class Course {
        private String courseName;
        private int semester;

        public Course(String courseName, int semester) {
            this.courseName = courseName;
            this.semester = semester;
        }

        @Override
        public String toString() {
            return courseName + " (Semester " + semester + ")";
        }
    }

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void addCourse(String courseName, int semester) {
        courses.add(new Course(courseName, semester));
    }

    public void checkScholarship(int marks) {
        Scholarship eligibility = new Scholarship() {
            @Override
            public boolean isEligible() {
                return marks >= 90;
            }
        };
        System.out.println("Scholarship Eligibility: " + eligibility.isEligible());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student s = (Student) obj;
        return rollNo == s.rollNo && Objects.equals(name, s.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rollNo);
    }

    @Override
    public String toString() {
        return "Student: " + name + ", Roll No: " + rollNo + ", Courses: " + courses;
    }

    interface Scholarship {
        boolean isEligible();
    }
}

public class Prac1_2 {
    public static void main(String[] args) {
        Student s1 = new Student("Urval", 101);
        Student s2 = new Student("Pushti", 102);

        s1.addCourse("Maths", 1);
        s1.addCourse("Physics", 1);
        s2.addCourse("Chemistry", 1);

        System.out.println(s1);
        System.out.println(s2);

        s1.checkScholarship(95);
        s2.checkScholarship(85);

        Student s3 = new Student("Urval", 101);
        System.out.println("s1 equals s3? " + s1.equals(s3));

    System.out.println("24CE052<-->Pushti Kansara");
    }
}
