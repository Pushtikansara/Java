package StudentManage.Details;

public class StuDetails {
    private int id;
    private String name;
    private int age;
    private String course;
    private int[] marks;

    public StuDetails(int id, String name, int age, String course, int[] marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.marks = marks;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCourse() { return course; }
    public int[] getMarks() { return marks; }

    // Display info
    public void displayStudentInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}
