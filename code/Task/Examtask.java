package Task;
interface exam{
    int pass(int mark);
}
interface divison{
    String classify(int avg);

}
class Student implements exam, divison
{ 
    private int mark;
    private int avg;

    public Student(int avg, int marks) {
        this.avg = avg;
        this.mark = marks;
    }

    @Override
    public int pass(int mark) {
        return mark >= 50 ? 1 : 0; 
    }

    @Override
    public String classify(int avg) 
    {
        if (avg >= 60) {
            return "First Class"; 
        } else if (avg >= 50) {
            return "Second Class";
        } else if (avg >= 40) {
            return "Third Class"; 
        } else {
            return "Fail"; 
        }
    }
}
public class Examtask {
    public static void main(String[]args)
    {
        Student student = new Student(65, 76);
        System.out.println("Pass Status: " + student.pass(76));
        System.out.println("Classify Status: " + student.classify(65)); 

    }
    
}