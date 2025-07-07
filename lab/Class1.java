package lab;

public class Class1 {
    private String name;
    private int ID;
    private String dept;
    private int salary;

    
    public Class1() {
        name = "No name";
        ID = 0;
        dept = "No department";
        salary = 0;
    }

   
    public Class1(String name, int ID, String dept, int salary) {
      this();
        this.name = name;
        this.ID = ID;
        this.dept = dept;
        this.salary = salary;
    }

    
    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public String getDept() {
        return dept;
    }

    public int getSalary() {
        return salary;
    }
}

    

